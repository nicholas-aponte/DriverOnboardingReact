import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import LoadingIndicator from './components/LoadingIndicator/LoadingIndicator';

ReactDOM.render(
  <React.StrictMode>
    <App />
    <LoadingIndicator/>
  </React.StrictMode>,
  document.getElementById('root')
);


// reportWebVitals(console.log);
