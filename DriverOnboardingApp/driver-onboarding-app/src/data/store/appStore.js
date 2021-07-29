import { useReducer } from "react";
import { createContainer } from "react-tracked";
import Moment from "moment";
import { TAB_ID_KEY } from "data/customHooks/useTabId";
import { getLsnId } from "Utils/WebUserUtils";
import {
  filtersReducer,
  invoiceDocsReducer,
  invoiceTripsReducer,
  resetStateReducer,
  standardReducer,
} from "../reducers";

// global state here 
export const initialState = {
   
  };
  