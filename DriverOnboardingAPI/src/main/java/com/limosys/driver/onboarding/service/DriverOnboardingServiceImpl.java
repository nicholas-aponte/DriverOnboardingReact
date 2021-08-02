package com.limosys.driver.onboarding.service;

import java.sql.Date;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.limosys.driver.onboarding.dto.DriverApplicationDTO;
import com.limosys.driver.onboarding.model.Driver;
import com.limosys.driver.onboarding.repository.DriverOnboardingRepo;

@Service
public class DriverOnboardingServiceImpl implements DriverOnboardingServiceInterface {
	
	@Autowired
	private DriverOnboardingRepo driverOnboardingRepo;
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void submitDriverApplication(DriverApplicationDTO driverAppDTO) throws Exception {
		Driver newDriver = driverAppDTO.getDriver();
		if( newDriver == null ) throw new Exception("Driver Application data is null.");
		
		Optional<Driver> driverWrapper = driverOnboardingRepo.findByDrvrUniqueId( newDriver.getDrvrUniqueId() );

		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss:SSS");
		Date dateNow = new Date(System.currentTimeMillis());		
		
		if (!driverWrapper.isPresent()) {	
			newDriver.setCreateDate( sdf.format(dateNow) );
			newDriver.setUpdateDate( sdf.format(dateNow) );
			driverOnboardingRepo.save(newDriver);
		} else {
			// Otherwise update existing one
			Driver existingDriver = (Driver)driverWrapper.get();
			newDriver.setDrverId(existingDriver.getDrverId());
			newDriver.setCreateDate( existingDriver.getCreateDate() );
			newDriver.setUpdateDate( sdf.format(dateNow) );
			
			//Delete existing addresses and re-insert
			Query q = em.createNativeQuery( MessageFormat.format("DELETE FROM dbo.DRVR_ADDR WHERE DRVR_ID = {0,number,#} ", existingDriver.getDrverId() ) );
			q.executeUpdate();
			
			//set new addresses
			//newDriver.setDriverAddresses( newDriver.getDriverAddresses() );
			
			em.merge(newDriver);
		}
		
		
	}
}
