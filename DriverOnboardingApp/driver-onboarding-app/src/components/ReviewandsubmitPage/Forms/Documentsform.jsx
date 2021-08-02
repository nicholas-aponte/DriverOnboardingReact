import React from 'react';
import { Grid, Typography } from '@material-ui/core';
import { InputField, DatePickerField , SelectField} from '../../FormFields';


const documentTypes = [
  {
    value: undefined,
    label: 'None'
  },
  {
    value: '1',
    label: 'Driver-TLC'
  },
  {
    value: '2',
    label: 'Vehicle-TLC'
  },
  {
    value: '3',
    label: 'Drivers License '
  },
  {
    value: '4',
    label: 'Other countries License '
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
export default function Documentsform(props) {
  const {
    formField: { documentIssuedState, documentIssuedCountry, documentBackImage,documentFrontImage, documentType,documentNumber, expiryDate, cvv }
  } = props;




  return (
    <>
      <Typography variant="h6" gutterBottom>
        Driver documents
      </Typography>
      <Grid container spacing={6}>
      <Grid item xs={12} md={3}>
        <SelectField
            name={documentIssuedCountry.name}
            label={documentIssuedCountry.label}
            data={countries}
            fullWidth
          />
        </Grid>
        <Grid item xs={12} md={6}>
        <SelectField
            name={documentIssuedState.name}
            label={documentIssuedState.label}
            data={states}
            fullWidth
          />
        </Grid>
        <Grid item xs={12} md={6}>
        <SelectField
            name={documentType.name}
            label={documentType.label}
            data={documentTypes}
            fullWidth
          />
        </Grid>
        
        
        <Grid item xs={12} md={6}>
          <InputField
            name={documentNumber.name}
            label={documentNumber.label}
            fullWidth
          />
        </Grid>
        <Grid item xs={12} md={6}>
          <DatePickerField
            name={expiryDate.name}
            label={expiryDate.label}
            format="MM/dd/yy"
            views={['year', 'month', 'day']}
            minDate={new Date()}
            maxDate={new Date('2050/12/31')}
            fullWidth
          />
        </Grid>
        <Grid item xs={12} md={6}>
          <InputField
            name={documentFrontImage.name}
            label={documentFrontImage.label}
            fullWidth
          />
        </Grid>
        <Grid item xs={12} md={6}>
          <InputField
            name={documentBackImage.name}
            label={documentBackImage.label}
            fullWidth
          />
        </Grid>
      </Grid>
    </>
  );
}
