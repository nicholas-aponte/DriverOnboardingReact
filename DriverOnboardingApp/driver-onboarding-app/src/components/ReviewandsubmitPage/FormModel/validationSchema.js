import * as Yup from 'yup';
import moment from 'moment';
import reviewFormModel from './reviewFormModel';
const {
  formField: {
    firstName,
    lastName,
    address1,
    city,
    zipcode,
    country,
    
  }
} = reviewFormModel;

// const visaRegEx = /^(?:4[0-9]{12}(?:[0-9]{3})?)$/;

const stepOneSchema = Yup.object().shape({
  [firstName.name]: Yup.string().required(`${firstName.requiredErrorMsg}`),
  [lastName.name]: Yup.string().required(`${lastName.requiredErrorMsg}`),
  [address1.name]: Yup.string().required(`${address1.requiredErrorMsg}`),
  [city.name]: Yup.string()
    .nullable(),
    // .required(`${city.requiredErrorMsg}`),
  [zipcode.name]: Yup.string()
    .required(`${zipcode.requiredErrorMsg}`)
    .test(
      'len',
      `${zipcode.invalidErrorMsg}`,
      val => val && val.length === 5
    ),
  [country.name]: Yup.string()
    .nullable()
    .required(`${country.requiredErrorMsg}`)
})

const stepTwoSchema = Yup.object().shape({

  [firstName.name]: Yup.string().required(`${firstName.requiredErrorMsg}`),
  [lastName.name]: Yup.string().required(`${lastName.requiredErrorMsg}`),
  [address1.name]: Yup.string().required(`${address1.requiredErrorMsg}`),
  [city.name]: Yup.string()
    .nullable()
    .required(`${city.requiredErrorMsg}`),
  [zipcode.name]: Yup.string()
    .required(`${zipcode.requiredErrorMsg}`)
    .test(
      'len',
      `${zipcode.invalidErrorMsg}`,
      val => val && val.length === 5
    ),
  [country.name]: Yup.string()
    .nullable()
    .required(`${country.requiredErrorMsg}`)



  
})

const schemaArr = [stepOneSchema, stepTwoSchema];

export default schemaArr;
