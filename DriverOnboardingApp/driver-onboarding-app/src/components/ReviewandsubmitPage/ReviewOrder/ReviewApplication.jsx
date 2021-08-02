import React from 'react';
import { useFormikContext } from 'formik';
import { Typography, Grid } from '@material-ui/core';
import ProductDetails from './ProductDetails';
import AddressDetails from './AddressDetails';
import DocumentDetails from './DocumentDetails';

export default function ReviewApplication() {
  const { values: formValues } = useFormikContext();
  return (
    <React.Fragment>
      <Typography variant="h6" gutterBottom>
        Application summary
      </Typography>
      <ProductDetails />
      <Grid container spacing={2}>
        <AddressDetails formValues={formValues} />
        <DocumentDetails formValues={formValues} />
      </Grid>
    </React.Fragment>
  );
}
