package com.limosys.driver.onboarding.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.limosys.driver.onboarding.dto.DriverApplicationDTO;
import com.limosys.driver.onboarding.service.DriverOnboardingServiceInterface;

@RestController
@RequestMapping(value = "/api/driver/onboarding", produces = MediaType.APPLICATION_JSON_VALUE)
public class DriverOnboardingController {
	
	@Autowired
	private DriverOnboardingServiceInterface driverOnboardingService;
		
	@RequestMapping(value = "/application", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public  void submitDriverApplication(@RequestBody DriverApplicationDTO driverApplicationDTO, HttpServletRequest request) throws Exception {
		
		// check if the DRVR_ID already exists, 
			//if it does, Merge changes
			// if not 
			driverOnboardingService.submitDriverApplication(driverApplicationDTO);
		
		
		
		
		
		
//		context.MyEntities.AddOrUpdate(e => e.Id, entity);
//		MediaType.APPLICATION_JSON_VALUE.contains(null)
		
		
	}//public void  submitDriverApplication
	
	
	

}
