
import './App.css';
import BasicDriverInfoForm from "./components/BasicDriverInfoForm"
import DriverLocationDocs  from './components/DriverLocationDocsForm';
import React from "react";
// import { AppStateProvider } from './data/store/appStore';
import { Router, Route, Switch, Link, Redirect } from 'react-router-dom';
// import AppLayout from './layouts/AppLayout/AppLayout';
// import Auth from './layouts/AuthLayout/Auth';

import { createBrowserHistory } from "history";

const hist = createBrowserHistory({
  basename: process.env.PUBLIC_URL
});
// function App() {
  const App = () => (
    <>



    <Router history={hist}>
      <Switch>
        <Route path="/basic-driver-info" component= {BasicDriverInfoForm} />
        <Route path="/documents" component={DriverLocationDocs} />
        <Redirect from="/" to="/basic-driver-info" />
      </Switch>
    </Router>
    {/* <BasicDriverInfoForm></BasicDriverInfoForm>
    <DriverLocationDocs></DriverLocationDocs> */}
    </>
  );

export default App;
