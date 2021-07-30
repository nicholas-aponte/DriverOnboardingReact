import React, { useState, useEffect } from "react";
import { Apply } from "../../data/api"

import TextField from '@material-ui/core/TextField';
import styles from "./DriverApplicationStyle";
import { useHistory } from "react-router-dom";

// @material-ui/core components
import { makeStyles } from "@material-ui/core/styles";

import { InputAdornment, Icon } from "@material-ui/core";

// @material-ui/icons
import { Face,  CameraAlt}  from "@material-ui/icons";





import GridContainer from "../../components/MUIComponents/GridContainer/GridContainer";
import GridItem from "../../components/MUIComponents/GridItem/GridItem";
import CustomInput from "../../components/MUIComponents/CustomInput/CustomInput";
import Button from "../../components/MUIComponents/Button/Button";
import Card from "../../components/MUIComponents/Card/Card";
import CardBody from "../../components/MUIComponents/CardBody/CardBody";
import CardHeader from "../../components/MUIComponents/CardHeader/CardHeader";
import CardFooter from "../../components/MUIComponents/CardFooter/CardFooter";

const useStyles = makeStyles(styles);



export default function DriverApplication() {
    const history = useHistory();
    const classes = useStyles();
const driverApplication = {
    
        "driver": {
          "dob": "1996-04-14",
          "drvrUniqueId": "133713375",
          "firstName": "string",
          "lastName": "string",
          "middleName": "string"
        
      
      },
      "driverAddresses": [
            {
              "addr1TXT": "string",
              "addr2TXT": "string",
              "aptNumTXT": "string",
              "areaCd": "string",
              "cityNme": "string",
              "countryID": 0,
              "geoAddrType": "TP",
              "postalCode": "string",
              "stateCode": "NY",
              "streetNme": "string",
              "streetNumTXT": "string"
            }
          ],
      "driverCommMechs": [
            {
              "commMechTxt": "string",
              "commMechTypeCd": "string"
            }
          ],
      "driverDocs": [
            {
              "drvrDocBackFilePath": "string",
              "drvrDocExpiration": "string",
              "drvrDocFrontFilePath": "string",
              "drvrDocIssuedCountry": "string",
              "drvrDocIssuedState": "string",
              "drvrDocNumber": "string",
              "drvrDocTypeCd": "string",
              "drvrDocTypeDesc": "string"
            }
          ],
      "driverPhones": [
            {
              "phoneNumTxt": "string",
              "phoneTypeCd": "string"
            }
          ]
      
      
}
const [application, setApplication] = useState(driverApplication)


const handleFieldValueChange = (e) => {
    const { id, value } = e.target;
    setApplication((prevState) => ({
      ...prevState,
     // new state 
    }));
  };


  const handleSubmit = (e) => {
    Apply("application/submit", application, history )
  };



return (

<div className={classes.container}>
      <GridContainer justify="center">
        <GridItem xs={12} sm={6} md={4}>
          <form>
            <Card application>
              <CardHeader
                className={`${classes.cardHeader} ${classes.textCenter}`}
                color="primary"
              >
                <h4 className={classes.white}>Driver Onboarding Application</h4>

              </CardHeader>
              <CardBody>
               
                <CustomInput
                  id="firstName"
                  value={application.driver.firstName}
                  onChange={handleFieldValueChange}
                  formControlProps={{
                    fullWidth: true,
                  }}
                  inputProps={{
                    endAdornment: (
                      <InputAdornment position="end">
                        <Face className={classes.inputAdornmentIcon} />
                      </InputAdornment>
                    ),
                    placeholder: `first name`,
                  }}
                />
                <CustomInput
                  id="middleName"
                  value={application.driver.middleName}
                  onChange={handleFieldValueChange}
                  formControlProps={{
                    fullWidth: true,
                  }}
                  inputProps={{
                    endAdornment: (
                      <InputAdornment position="end">
                        <Face className={classes.inputAdornmentIcon} />
                      </InputAdornment>
                    ),
                    placeholder: `middle name`,
                  }}
                />
                <CustomInput
                  id="lastName"
                  value={application.driver.lastName}
                  onChange={handleFieldValueChange}
                  formControlProps={{
                    fullWidth: true,
                  }}
                  inputProps={{
                    endAdornment: (
                      <InputAdornment position="end">
                        <Face className={classes.inputAdornmentIcon} />
                      </InputAdornment>
                    ),
                    placeholder: `last name`,
                  }}
                />
               
                
               <TextField
                    id="date"
                    label="Date of birth"
                    type="date"
                    defaultValue="2021-07-30"
                    className={classes.textField}
                    InputLabelProps={{
                    shrink: true,
               }}
                 />
                
                
                {/* <CustomInput
                  id="First Name"
                  value={application.driver.firstName}
                  onChange={handleFieldValueChange}
                  formControlProps={{
                    fullWidth: true,
                  }}
                  inputProps={{
                    endAdornment: (
                      <InputAdornment position="end">
                        <CameraAlt className={classes.inputAdornmentIcon} />
                      </InputAdornment>
                    ),
                    placeholder: `document front photo`,
                  }}
                /> */}
                
                
              </CardBody>
              <CardFooter className={classes.justifyContentCenter}>
                <Button
                  onClick={() => {handleSubmit()}}
                  color="primary"
                  simple
                  size="lg"
                  block
                >
                  NEXT
                </Button>
                {/* <Button
                  onClick={() => {handleSubmit()}}
                  color="primary"
                  simple
                  size="lg"
                  block
                >
                  Apply
                </Button> */}
              </CardFooter>
            </Card>
          </form>
        </GridItem>
      </GridContainer>
    </div>

)}