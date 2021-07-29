import merge from 'lodash/merge'
import axios from "axios";
import { configureRefreshFetch, fetchJSON } from 'refresh-fetch'
// import { isLoggedIn } from 'Utils/WebUserUtils';
import { trackPromise } from 'react-promise-tracker';

export default axios.create({
    baseURL: "http://localhost:8080/api",
    headers: {
      "Content-type": "application/json"
    }
  });