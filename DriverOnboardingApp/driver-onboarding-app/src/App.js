
import './App.css';
import DriverApplication  from './Pages/DriverApplication/DriverApplication';
import React from "react";
import { Router, Route, Switch, Link, Redirect } from 'react-router-dom';


import { createBrowserHistory } from "history";
import MaterialLayout from './components/Layout/MaterialLayout';
import CheckoutPage from './components/CheckoutPage';


const hist = createBrowserHistory({
  basename: process.env.PUBLIC_URL
});
// function App() {
  const App = () => (
    <>



    <Router history={hist}>
      <MaterialLayout>
        <CheckoutPage></CheckoutPage>
      {/* <Switch>
        <Route path="/basic-driver-info" component=  {DriverApplication} />
        <Redirect from="/" to="/basic-driver-info" />
      </Switch> */}
      </MaterialLayout>
    </Router>
    
    
    </>
  );

export default App;
