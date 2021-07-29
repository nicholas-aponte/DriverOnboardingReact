package com.limosys.driver.onboarding.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

// imports for Serialization if needed
//import java.io.Serializable;
//import java.util.Collection;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name = "DRVR", schema = "DBO")
public class Driver implements Serializable {
	
	@Id
	@Column(name = "DRVR_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long drverId;
	
	@Column(name = "DRVR_UNIQUE_ID")
	private String drvrUniqueId;
		
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "MIDDLE_NAME")
	private String middleName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dob;
	
	
	//REVIEW 
	//Set inverse relationship
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "driver", cascade = CascadeType.ALL)  
	private Set<DriverAddress> driverAddresses;
	
	public void setDriverAddresses(Set<DriverAddress> driverAddresses ) {
		this. driverAddresses = driverAddresses ;
		
        //To set initialize driver object in DriverAddress class to "this" instance (to relate them together)
        this.driverAddresses.forEach(x -> x.setDriver(this) );
	}
	public Set< DriverAddress > getDriverAddresses(){
		return this.driverAddresses ;
	}
	//**************************************
	
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
	
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getDrvrUniqueId() {
		return drvrUniqueId;
	}
	public void setDrvrUniqueId(String drvrUniqueId) {
		this.drvrUniqueId = drvrUniqueId;
	}
	
}
