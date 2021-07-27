package com.limosys.driver.onboarding.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

// imports for Serialization if needed
//import java.io.Serializable;
//import java.util.Collection;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;



public class Driver {
	
	
// dbo.DRVR 
	private String firstName;
	private String middleName;
	private String lastName;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dob;
	
	private String drvrUniqueId;

// dbo.DRVR_ADDR
	private String addressType; // might not be needed, region?
	private String streetNme;
	private String streetNumTxt;
	private String address1Txt;
	private String address2Txt;
	private String cityName;
	private String postalCode;
	private String stateCode;
	private String areaCode;
	private String countryCode;
	
//dbo.DRVR_COMM_MECH
	private String email;
	private String commMechTypeCode;
	private String commMechText;
	
//dbo.DRVR_PHONE
	private String phoneTypeCode;
	private Integer phoneNumber;
	
//dbo.DRVR_DOC
	private String drvrDocID;
	private String drvrDocTypeDesc;
	private String drvrDocNumber;
	private String drvrDocIssedcountry;
	private String drvrDocIssuedState;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate drvrDocExpiration;
	
	private String drvrDocFrontImage;
	private String drvrdocBackImage;
	
	
// getters/setters 
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDrvrUniqueId() {
		return drvrUniqueId;
	}
	public void setDrvrUniqueId(String drvrUniqueId) {
		this.drvrUniqueId = drvrUniqueId;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getStreetNme() {
		return streetNme;
	}
	public void setStreetNme(String streetNme) {
		this.streetNme = streetNme;
	}
	public String getStreetNumTxt() {
		return streetNumTxt;
	}
	public void setStreetNumTxt(String streetNumTxt) {
		this.streetNumTxt = streetNumTxt;
	}
	public String getAddress1Txt() {
		return address1Txt;
	}
	public void setAddress1Txt(String address1Txt) {
		this.address1Txt = address1Txt;
	}
	public String getAddress2Txt() {
		return address2Txt;
	}
	public void setAddress2Txt(String address2Txt) {
		this.address2Txt = address2Txt;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCommMechTypeCode() {
		return commMechTypeCode;
	}
	public void setCommMechTypeCode(String commMechTypeCode) {
		this.commMechTypeCode = commMechTypeCode;
	}
	public String getCommMechText() {
		return commMechText;
	}
	public void setCommMechText(String commMechText) {
		this.commMechText = commMechText;
	}
	public String getPhoneTypeCode() {
		return phoneTypeCode;
	}
	public void setPhoneTypeCode(String phoneTypeCode) {
		this.phoneTypeCode = phoneTypeCode;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDrvrDocID() {
		return drvrDocID;
	}
	public void setDrvrDocID(String drvrDocID) {
		this.drvrDocID = drvrDocID;
	}
	public String getDrvrDocTypeDesc() {
		return drvrDocTypeDesc;
	}
	public void setDrvrDocTypeDesc(String drvrDocTypeDesc) {
		this.drvrDocTypeDesc = drvrDocTypeDesc;
	}
	public String getDrvrDocNumber() {
		return drvrDocNumber;
	}
	public void setDrvrDocNumber(String drvrDocNumber) {
		this.drvrDocNumber = drvrDocNumber;
	}
	public String getDrvrDocIssedcountry() {
		return drvrDocIssedcountry;
	}
	public void setDrvrDocIssedcountry(String drvrDocIssedcountry) {
		this.drvrDocIssedcountry = drvrDocIssedcountry;
	}
	public String getDrvrDocExpiration() {
		return drvrDocExpiration;
	}
	public void setDrvrDocExpiration(String drvrDocExpiration) {
		this.drvrDocExpiration = drvrDocExpiration;
	}
	public String getDrvrDocFrontImage() {
		return drvrDocFrontImage;
	}
	public void setDrvrDocFrontImage(String drvrDocFrontImage) {
		this.drvrDocFrontImage = drvrDocFrontImage;
	}
	public String getDrvrDocIssuedState() {
		return drvrDocIssuedState;
	}
	public void setDrvrDocIssuedState(String drvrDocIssuedState) {
		this.drvrDocIssuedState = drvrDocIssuedState;
	}
	public String getDrvrdocBackImage() {
		return drvrdocBackImage;
	}
	public void setDrvrdocBackImage(String drvrdocBackImage) {
		this.drvrdocBackImage = drvrdocBackImage;
	}
}
