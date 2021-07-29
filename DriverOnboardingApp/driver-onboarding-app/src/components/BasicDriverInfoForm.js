import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';
import {Link} from "react-router-dom"
const useStyles = makeStyles((theme) => ({
  root: {
    '& > *': {
      margin: theme.spacing(1),
      width: '25ch',
    },
  },
}));

export default function BasicDriverInfoForm() {
  const classes = useStyles();
  
// store in state so back button in driverLocation populated properly 
  return (
    <form className={classes.root} noValidate autoComplete="off">
      {/* <TextField id="standard-basic" label="Standard" />
      <TextField id="outlined-basic" label="Outlined" variant="outlined" /> */}
      <div>
        <h3>Identification</h3>
        <TextField id="filled-basic" label="first name" variant="filled" />
        <TextField id="filled-basic" label="middle name" variant="filled" />
        <TextField id="filled-basic" label="last name" variant="filled" />
        <TextField id="filled-basic" label="date of birth yyyy-MM-dd" variant="filled" />
      </div>
      <div>
        <h3>Contact</h3>
        <TextField id="filled-basic" label="Phone Number" variant="filled" />
        <TextField id="filled-basic" label="Email" variant="filled" />
      </div>
      {/* <button >Next Button</button> */}
      <Link to="/documents">
          <button type="button">
             Next
          </button>
      </Link>
    </form>
  );
}
