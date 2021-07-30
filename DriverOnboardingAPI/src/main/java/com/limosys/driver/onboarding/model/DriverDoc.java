//package com.limosys.driver.onboarding.model;
//
//public class DriverPhone {
//
//}
package com.limosys.driver.onboarding.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "DRVR_DOC", schema = "DBO")
public class DriverDoc implements Serializable {
		
	
	@Id
	@Column(name = "DRVR_DOC_TYPE_CD" ,unique=true, nullable = false)
 
	private String  drvrDocTypeCd;
	
	
	@Column(name = "DRVR_DOC_TYPE_DESC")
	private String drvrDocTypeDesc;
	
	@Column(name = "DRVR_DOC_NUMBER")
	private String drvrDocNumber;
	
	@Column(name = "DRVR_DOC_EXPIRATION")
	private String drvrDocExpiration;
	
	@Column(name = "DRVR_DOC_FRONT_FILE_PATH")
	private String drvrDocFrontFilePath;
	
	@Column(name = "DRVR_DOC_BACK_FILE_PATH")
	private String drvrDocBackFilePath;
	
	@Column(name = "DRVR_DOC_ISSUED_COUNTRY")
	private String drvrDocIssuedCountry;
	
	@Column(name = "DRVR_DOC_ISSUED_STATE")
	private String drvrDocIssuedState;
	
	
		
	//***************// Creates relationship via foreign key Driver_ID to DRVR 
	@ManyToOne
    @JoinColumn(name="DRVR_ID")
    private Driver driver;
	public void setDriver(Driver driver) {
		this.driver= driver;
	}
	//*********************************
		
	
	public String getDrvrDocTypeCd() {
		return drvrDocTypeCd;
	}
	public void setDrvrDocTypeCd(String drvrDocTypeCd) {
		this.drvrDocTypeCd = drvrDocTypeCd;
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
	public String getDrvrDocExpiration() {
		return drvrDocExpiration;
	}
	public void setDrvrDocExpiration(String drvrDocExpiration) {
		this.drvrDocExpiration = drvrDocExpiration;
	}
	public String getDrvrDocFrontFilePath() {
		return drvrDocFrontFilePath;
	}
	public void setDrvrDocFrontFilePath(String drvrDocFrontFilePath) {
		this.drvrDocFrontFilePath = drvrDocFrontFilePath;
	}
	public String getDrvrDocBackFilePath() {
		return drvrDocBackFilePath;
	}
	public void setDrvrDocBackFilePath(String drvrDocBackFilePath) {
		this.drvrDocBackFilePath = drvrDocBackFilePath;
	}
	public String getDrvrDocIssuedCountry() {
		return drvrDocIssuedCountry;
	}
	public void setDrvrDocIssuedCountry(String drvrDocIssuedCountry) {
		this.drvrDocIssuedCountry = drvrDocIssuedCountry;
	}
	public String getDrvrDocIssuedState() {
		return drvrDocIssuedState;
	}
	public void setDrvrDocIssuedState(String drvrDocIssuedState) {
		this.drvrDocIssuedState = drvrDocIssuedState;
	}
	
	
	
	
	
	
	
	
	
	
}
