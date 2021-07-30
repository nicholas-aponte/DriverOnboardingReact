import merge from 'lodash/merge';
import { trackPromise } from 'react-promise-tracker';
import {  fetchJSON } from 'refresh-fetch'
export const serverUrl = process.env.REACT_APP_DEV_URL || process.env.REACT_APP_PROD_URL;




const fetcher = (urlEndPoint, request, options) => {
    let optionsMerged = merge({}, options, {
        method: 'POST',
        credentials: 'include',
        body: JSON.stringify(request)
    })
    return trackPromise(fetchJSON(serverUrl + urlEndPoint, optionsMerged));
}

const Apply = (urlEndPoint, applicationRequest, history) => {
    return fetcher(urlEndPoint, applicationRequest, {
        method: 'POST',
    })
        .then(response => {
            console.log("getting response")
        }).catch((error) => { 
           
            // history.push("Error Page")
            console.log( "Theres a problem" + error)
        })
        
}
export {
    Apply
}