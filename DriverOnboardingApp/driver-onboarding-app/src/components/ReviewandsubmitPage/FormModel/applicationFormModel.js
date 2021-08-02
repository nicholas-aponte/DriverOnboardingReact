const ApplicationFormModel =  {
    formId: 'applicationForm',
    formField: {
      firstName: {
        name: 'firstName',
        label: 'First name*',
        requiredErrorMsg: 'First name is required'
      },
      lastName: {
        name: 'lastName',
        label: 'Last name*',
        requiredErrorMsg: 'Last name is required'
      },
      email: {
        name: 'email',
        label: 'email',
        requiredErrorMsg: 'email is required'
      },
      phoneNumber: {
        name: 'phoneNumber',
        label: 'Phone Number*',
        requiredErrorMsg: 'Phone Number is required',
        
      },
      address1: {
        name: 'address1',
        label: 'Address Line 1*',
        requiredErrorMsg: 'Address Line 1 is required'
      },
      address2: {
        name: 'address2',
        label: 'Address Line 2'
      },
      city: {
        name: 'city',
        label: 'City',
        requiredErrorMsg: 'City is required'
      },
      state: {
        name: 'state',
        label: 'State/Province/Region',
        requiredErrorMsg: 'region is required',
      },
      zipcode: {
        name: 'zipcode',
        label: 'Zipcode*',
        requiredErrorMsg: 'Zipcode is required',
        invalidErrorMsg: 'Zipcode is not valid (e.g. 70000)'
      },
      country: {
        name: 'country',
        label: 'Country*',
        requiredErrorMsg: 'Country is required'
      },
      
      documentType: {
        name: 'documentType*',
        label: 'Doc Type',
        requiredErrorMsg: 'Name on card is required'
      },
      documentNumber: {
        name: 'documentNumber',
        label: 'Document Number*',
        requiredErrorMsg: ' number is required',
        invalidErrorMsg: 'number is not valid (e.g. 4111111111111)'
      },
      documentIssuedCountry: {
        name: 'issuedCountry*',
        label: 'Issued Country',
        requiredErrorMsg: 'required'
      },
      documentIssuedState: {
        name: 'issuedState*',
        label: 'issued Region',
        requiredErrorMsg: ' required'
      },
      expiryDate: {
        name: 'expiryDate',
        label: 'Expiry date*',
        requiredErrorMsg: 'Expiry date is required',
        invalidErrorMsg: 'Expiry date is not valid'
      },
      documentFrontImage: {
        name: 'documentFrontImage',
        label: 'front document image*',
        requiredErrorMsg: 'CVV is required',
        invalidErrorMsg: 'CVV is invalid (e.g. 357)'
      },
      documentBackImage: {
        name: 'documentBackImage',
        label: 'back document image*',
        requiredErrorMsg: 'CVV is required',
        invalidErrorMsg: 'CVV is invalid (e.g. 357)'
      },
      // phoneNumber: {
      //   name: 'phoneNumber',
      //   label: 'Phone Number*',
      //   requiredErrorMsg: 'Phone Number is required',
      //   invalidErrorMsg: 'Phone Number is invalid (e.g. xxx-xxx-xxxx)'
      // },
      // email: {
      //   name: 'email',
      //   label: 'email',
      //   requiredErrorMsg: 'Email is required',
      //   invalidErrorMsg: 'email is invalid (e.g. email@domainname.domain)'
      // }
    }
  };
  export default ApplicationFormModel;