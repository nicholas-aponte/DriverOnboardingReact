package com.limosys.driver.onboarding.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.limosys.driver.onboarding.dto.DriverApplicationDTO;

@RestController
@RequestMapping(value = "/api/driver/onboarding", produces = MediaType.APPLICATION_JSON_VALUE)
public class DriverOnboardingController {
		
	@RequestMapping(value = "/application", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public  DriverApplicationDTO submitDriverApplication(@RequestBody DriverApplicationDTO driverApplicationDTO, HttpServletRequest request) throws Exception {
		
		return driverApplicationDTO;
	}//public void  submitDriverApplication
	

}
