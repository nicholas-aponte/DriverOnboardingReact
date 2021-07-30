package com.limosys.driver.onboarding.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "DRVR_ADDR", schema = "DBO")
public class DriverAddress implements Serializable {
		
	
	@Id
	@Column(name = "GEO_ADDR_TYPE")
	private String geoAddrType;
	
	@Column(name = "COUNTRY_ID")
	private Integer countryID;
	
	@Column(name = "STATE_CD")
	private String stateCode;
	
	@Column(name = "POSTAL_CD")
	private String postalCode;
	
	@Column(name = "CITY_NME")
	private String cityNme;
	
	@Column(name = "ADDR1_TXT")
	private String addr1TXT;
	
	@Column(name = "ADDR2_TXT")
	private String addr2TXT;
	

	@Column(name = "STREET_NME")
	private String streetNme;
	
	@Column(name = "STREET_NUM_TXT")
	private String streetNumTXT;
	
	@Column(name = "APT_NUM_TXT")
	private String aptNumTXT;
	 
	@Column(name = "AREA_CD")
	private String areaCd;
	
		
	//***************// Creates relationship via foreign key Driver_ID to DRVR 
	@ManyToOne
    @JoinColumn(name="DRVR_ID")
    private Driver driver;
	public void setDriver(Driver driver) {
		this.driver= driver;
	}
	//*********************************
		
	public String getGeoAddrType() {
		return geoAddrType;
	}

	public void setGeoAddrType(String geoAddrType) {
		this.geoAddrType = geoAddrType;
	}

	public Integer getCountryID() {
		return countryID;
	}

	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCityNme() {
		return cityNme;
	}

	public void setCityNme(String cityNme) {
		this.cityNme = cityNme;
	}

	public String getAddr1TXT() {
		return addr1TXT;
	}

	public void setAddr1TXT(String addr1txt) {
		addr1TXT = addr1txt;
	}

	public String getAddr2TXT() {
		return addr2TXT;
	}

	public void setAddr2TXT(String addr2txt) {
		addr2TXT = addr2txt;
	}

	public String getStreetNme() {
		return streetNme;
	}

	public void setStreetNme(String streetNme) {
		this.streetNme = streetNme;
	}

	public String getStreetNumTXT() {
		return streetNumTXT;
	}

	public void setStreetNumTXT(String streetNumTXT) {
		this.streetNumTXT = streetNumTXT;
	}

	public String getAptNumTXT() {
		return aptNumTXT;
	}

	public void setAptNumTXT(String aptNumTXT) {
		this.aptNumTXT = aptNumTXT;
	}

	public String getAreaCd() {
		return areaCd;
	}

	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}
	
	
	
	
	
	
	
	
	
}
