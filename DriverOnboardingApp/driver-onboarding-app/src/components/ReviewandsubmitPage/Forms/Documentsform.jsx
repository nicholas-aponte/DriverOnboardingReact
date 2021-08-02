import React from 'react';
import { Grid, Typography } from '@material-ui/core';
import { InputField, DatePickerField } from '../../FormFields';

export default function Documentsform(props) {
  const {
    formField: { documentBackImage,documentFrontImage, documentType,documentNumber, expiryDate, cvv }
  } = props;

  return (
    <>
      <Typography variant="h6" gutterBottom>
        Driver documents
      </Typography>
      <Grid container spacing={3}>
        <Grid item xs={12} md={6}>
          <InputField
            name={documentType.name}
            label={documentType.label}
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
            format="MM/yy"
            views={['year', 'month']}
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
