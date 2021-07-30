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
@Table(name = "DRVR_COMM_MECH", schema = "DBO")
public class DriverCommMech implements Serializable {
		
	
	@Id
	@Column(name = "COMM_MECH_TYPE_CD")
	private String commMechTypeCd;
	
	@Column(name = "COMM_MECH_TXT")
	private String commMechTxt;
	
	
	
		
	//***************// Creates relationship via foreign key Driver_ID to DRVR 
	@ManyToOne
    @JoinColumn(name="DRVR_ID")
    private Driver driver;
	public void setDriver(Driver driver) {
		this.driver= driver;
	}
	//*********************************
		
	

	public String getCommMechTypeCd() {
		return commMechTypeCd;
	}

	public void setCommMechTypeCd(String commMechTypeCd ) {
		this.commMechTypeCd = commMechTypeCd;
	}
	public String getCommMechTxt() {
		return commMechTxt;
	}

	public void setCommMechTxt(String commMechTxt) {
		this.commMechTxt = commMechTxt;
	}




	
	
	
	
	
	
	
	
	
}
