import React from 'react';
import moment from 'moment';
import { Typography, Grid } from '@material-ui/core';
import useStyles from './styles';

function DocumentDetails(props) {
  const { formValues } = props;
  const classes = useStyles();
  const { nameOnCard, cardNumber, expiryDate } = formValues;
  return (
    <Grid item container direction="column" xs={12} sm={6}>
      <Typography variant="h6" gutterBottom className={classes.title}>
        Driver documents
      </Typography>
      <Grid container>
        <React.Fragment>
          <Grid item xs={6}>
            <Typography gutterBottom>Document Type</Typography>
          </Grid>
          <Grid item xs={6}>
            <Typography gutterBottom>test</Typography>
          </Grid>
        </React.Fragment>
        <React.Fragment>
          <Grid item xs={6}>
            <Typography gutterBottom>Expiry Date</Typography>
          </Grid>
          <Grid item xs={6}>
            <Typography gutterBottom>
              {moment(expiryDate).format('MM/YY')}
            </Typography>
          </Grid>
        </React.Fragment>
        <React.Fragment>
          <Grid item xs={6}>
            <Typography gutterBottom>Document Images</Typography>
          </Grid>
          
        </React.Fragment>
      </Grid>
    </Grid>
  );
}

export default DocumentDetails;
