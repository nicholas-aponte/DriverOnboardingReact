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
@Table(name = "DRVR_PHONE", schema = "DBO")
public class DriverPhone implements Serializable {
		
	
	@Id
	@Column(name = "PHONE_TYPE_CD")
	private String phoneTypeCd;
	
	@Column(name = "PHONE_NUM_TXT")
	private String phoneNumTxt;
	
		
	//***************// Creates relationship via foreign key Driver_ID to DRVR 
	@ManyToOne
    @JoinColumn(name="DRVR_ID")
    private Driver driver;
	public void setDriver(Driver driver) {
		this.driver= driver;
	}
	//*********************************
		
	

	public String getPhoneTypeCd() {
		return phoneTypeCd;
	}

	public void setPhoneTypeCd(String phoneTypeCd) {
		this.phoneTypeCd = phoneTypeCd;
	}
	public String getPhoneNumTxt() {
		return phoneNumTxt;
	}

	public void setPhoneNumTxt(String phoneNumTxt) {
		this.phoneNumTxt = phoneNumTxt;
	}
	
	
	
	
	
	
	
	
	
}
