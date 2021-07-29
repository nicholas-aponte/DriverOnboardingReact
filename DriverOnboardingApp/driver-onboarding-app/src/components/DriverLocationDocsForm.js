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

export default function DriverLocationDocs() {
  const classes = useStyles();

  return (
    <form className={classes.root} noValidate autoComplete="off">
      {/* <TextField id="standard-basic" label="Standard" />
      <TextField id="outlined-basic" label="Outlined" variant="outlined" /> */}
      
      <div>
        <h3>Location</h3>
        <TextField id="filled-basic" label="street name" variant="filled" />
        <TextField id="filled-basic" label="house/apartment number" variant="filled" />
        <TextField id="filled-basic" label="City" variant="filled" />
        <TextField id="filled-basic" label="Postal Code" variant="filled" />
        <TextField id="filled-basic" label="State" variant="filled" />
        <TextField id="filled-basic" label="Country" variant="filled" />
      </div>
    
      <div>
        <h3>Documents</h3>
        <TextField id="filled-basic" label="Document type " variant="filled" /> {/* drop down of accepted types (maybe grabbed by previous location fields) */}
        <TextField id="filled-basic" label="Document Number " variant="filled" /> {/* [text should change based on doc type selected above] */}
        <TextField id="filled-basic" label="issued by Country " variant="filled" /> {/* [autofill US, drop down for other countries] */}

        <TextField id="filled-basic" label="issued by State" variant="filled" /> {/* [drop down, shown only if relevant] */}
         
        <TextField id="filled-basic" label="Document Expiration Date" variant="filled" />
        <TextField id="filled-basic" label="document front image" variant="filled" /> {/* [take image bttn] */}
        
        <TextField id="filled-basic" label="document back image" variant="filled" /> {/* [take image bttn] */}
        
      </div>
      <Link to="/basic-driver-info">
          <button type="button">
             Back
          </button>
      </Link>
      <button>Submit Button</button>
      
    
    </form>
  );
}
