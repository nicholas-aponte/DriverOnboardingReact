import React from 'react';
import { Grid, Typography } from '@material-ui/core';
import { InputField,  SelectField } from '../../FormFields';

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

export default function AddressForm(props) {
  const {
    formField: {
      firstName,
      lastName,
      address1,
      address2,
      city,
      state,
      zipcode,
      country,
      phoneNumber,
      email
    }
  } = props;
  return (
    <React.Fragment>
      <Typography variant="h6" gutterBottom>
        Driver Information
      </Typography>
      <Grid container spacing={6}>
        <Grid item xs={12} sm={6}>
          <InputField name={firstName.name} label={firstName.label} fullWidth />
        </Grid>
        <Grid item xs={12} sm={6}>
          <InputField name={lastName.name} label={lastName.label} fullWidth />
        </Grid>
        <Grid item xs={12} sm={6}>
          <InputField name={phoneNumber.name} label={phoneNumber.label} fullWidth />
        </Grid>
        <Grid item xs={12} sm={6}>
          <InputField name={email.name} label={email.label} fullWidth />
        </Grid>
        {/* <Grid item xs={12}>
          <InputField name={address1.name} label={address1.label} fullWidth />
        </Grid>
        <Grid item xs={12}>
          <InputField name={address2.name} label={address2.label} fullWidth />
        </Grid>
        <Grid item xs={12} sm={6}>
          <SelectField
            name={city.name}
            label={city.label}
            data={cities}
            fullWidth
          />
        </Grid>
        <Grid item xs={12} sm={6}>
          <SelectField
            name={state.name}
            label={state.label}
            data={states}
            fullWidth
          />
        </Grid>
        <Grid item xs={12} sm={6}>
          <InputField name={zipcode.name} label={zipcode.label} fullWidth />
        </Grid>
        <Grid item xs={12} sm={6}>
          <SelectField
            name={country.name}
            label={country.label}
            data={countries}
            fullWidth
          />
        </Grid> */}
        
       
      </Grid>
    </React.Fragment>
  );
}
