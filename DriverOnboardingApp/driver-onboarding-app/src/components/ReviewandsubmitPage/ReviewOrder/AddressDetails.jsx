import React from 'react';
import { Typography, Grid } from '@material-ui/core';
import useStyles from './styles';

const cities = [
  {
    value: undefined,
    label: 'None'
  },
  {
    value: '1',
    label: 'New York'
  },
  {
    value: '2',
    label: 'Trenton'
  },
  {
    value: '3',
    label: 'Other '
  }
];

const states = [
  {
    value: undefined,
    label: 'None'
  },
  {
    value: '1',
    label: 'New york'
  },
  {
    value: '2',
    label: 'New Jersey'
  },
  {
    value: '3',
    label: 'Other'
  }
];

const countries = [
  {
    value: null,
    label: 'None'
  },
  {
    value: '1',
    label: 'United States'
  },
  {
    value: '2',
    label: 'Other'
  },
  
];



function AddressDetails({ formValues }) {
  const { firstName, lastName, address1, address2, city, state, country, zipcode } = formValues
  const classes = useStyles();
  // console.log(formValues.city)
  return (
    <Grid item xs={12} sm={6}>
      <Typography variant="h6" gutterBottom className={classes.title}>
        Address
      </Typography>
      <Typography gutterBottom>{`${firstName} ${lastName}`}</Typography>
      <Typography gutterBottom>{`${address1}`}</Typography>
      <Typography gutterBottom>{`${address2}`}</Typography>
      <Typography gutterBottom>{cities[city]?.label}</Typography>
      <Typography gutterBottom>{states[state]?.label}</Typography>
      <Typography gutterBottom>{countries[country]?.label}</Typography>
      <Typography gutterBottom>{zipcode}</Typography>
      
    </Grid>
  );
}

export default AddressDetails;
