import React from 'react';
import { Typography, Grid } from '@material-ui/core';
import useStyles from './styles';

function AddressDetails(props) {
  const { formValues } = props;
  const classes = useStyles();
  const { firstName, lastName, address1, address2, city} = formValues;
  return (
    <Grid item xs={12} sm={6}>
      <Typography variant="h6" gutterBottom className={classes.title}>
        Address
      </Typography>
      <Typography gutterBottom>{`${firstName} ${lastName}`}</Typography>
      <Typography gutterBottom>{`${address1}`}</Typography>
      <Typography gutterBottom>{`${address2}`}</Typography>
      <Typography gutterBottom>{`${city.name}`}</Typography>
    </Grid>
  );
}

export default AddressDetails;
