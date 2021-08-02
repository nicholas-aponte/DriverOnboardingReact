package com.limosys.driver.onboarding.model;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


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
	
	@Column(name = "DOB")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dob;
	
	@Column(name = "CREATE_DATE")
	private String createDate;
	
	@Column(name = "UPDATE_DATE")
	private String updateDate;
	
		
	public Long getDrverId() {
		return drverId;
	}
	public void setDrverId(Long drverId) {
		this.drverId = drverId;
	}

	//REVIEW 
	//Set inverse relationship
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "driver", cascade = CascadeType.ALL)  
	private Set<DriverAddress> driverAddresses;
	
	public void setDriverAddresses(Set<DriverAddress> driverAddresses ) {
		this.driverAddresses = driverAddresses ;
		
        //To  initialize driver object in DriverAddress class to "this" instance (to relate them together)
        this.driverAddresses.forEach(x -> {        
        	x.setDriver(this);
        	
        });// this.driverAddresses.forEach
	}
	public Set< DriverAddress > getDriverAddresses(){
		return this.driverAddresses ;
	}
		

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "driver", cascade = CascadeType.ALL)
	private Set<DriverPhone> driverPhones; 
	
	public void setDriverPhones(Set<DriverPhone> driverPhones) {
		this.driverPhones = driverPhones;
		
		this.driverPhones.forEach(e -> e.setDriver(this));
	}
	public Set < DriverPhone > getDriverPhones(){
		return this.driverPhones ;
	}
	
	// --------------------------------------------------
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "driver", cascade = CascadeType.ALL)
	private Set<DriverCommMech> driverCommMechs; 
	
	public void setDriverCommMechs(Set<DriverCommMech> driverCommMechs) {
		this.driverCommMechs = driverCommMechs;
		
		this.driverCommMechs.forEach(i -> i.setDriver(this));
	}
	public Set < DriverCommMech > getDriverCommMechs(){
		return this.driverCommMechs ;
	}
	
	// --------------------------------------------------
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "driver", cascade = CascadeType.ALL)
	private Set<DriverDoc> driverDocs; 
	
	public void setDriverDocs(Set<DriverDoc> driverDocs) {
		this.driverDocs = driverDocs;
		
		this.driverDocs.forEach(i -> i.setDriver(this));
	}
	public Set < DriverDoc > getDriverDocs(){
		return this.driverDocs ;
	} 
	
		
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
	
	
	
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
}
