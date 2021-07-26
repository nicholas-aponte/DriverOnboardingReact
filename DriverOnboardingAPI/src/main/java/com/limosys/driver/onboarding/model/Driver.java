package com.limosys.driver.onboarding.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

// imports for Serialization if needed
//import java.io.Serializable;
//import java.util.Collection;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;


//import javax.persistence.*; // for image 
//@Entity
//@Table(name = "image_table")

public class Driver {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String phoneNumber;
	
	private String drvrLicense;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate drvrLicenseExperation;
	
	private String drvrTLC;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate drvrTLCExpiration;
	
	private String vehicleTLC; // get real name of this field 
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate vehicleTLCExpiration;
	
	private String cdlNumber;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate cdlExpiration;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDrvrLicense() {
		return drvrLicense;
	}
	public void setDrvrLicense(String drvrLicense) {
		this.drvrLicense = drvrLicense;
	}
	public String getDrvrTLC() {
		return drvrTLC;
	}
	public void setDrvrTLC(String drvrTLC) {
		this.drvrTLC = drvrTLC;
	}
	public String getVehicleTLC() {
		return vehicleTLC;
	}
	public void setVehicleTLC(String vehicleTLC) {
		this.vehicleTLC = vehicleTLC;
	}
	public String getCdlNumber() {
		return cdlNumber;
	}
	public void setCdlNumber(String cdlNumber) {
		this.cdlNumber = cdlNumber;
	}
	
	
	
	
	
	
}
