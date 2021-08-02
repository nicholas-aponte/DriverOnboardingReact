import reviewFormModel from './applicationFormModel';
const {
  formField: {
    firstName,
    lastName,
    address1,
    city,
    zipcode,
    country,
    phoneNumber,
    email,
    state
    
  }
} = reviewFormModel;

const defaultValues =  {
  [firstName.name]: '',
  [lastName.name]: '',
  [address1.name]: '',
  [city.name]: '',
  [zipcode.name]: '',
  [country.name]: '',
  [phoneNumber.name]: '',
  [email.name]: '',
  [state.name]: ''

};

export default defaultValues
