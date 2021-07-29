package com.limosys.driver.onboarding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.limosys.driver.onboarding.dto.DriverApplicationDTO;
import com.limosys.driver.onboarding.repository.DriverOnboardingRepo;

@Service
public class DriverOnboardingServiceImpl implements DriverOnboardingServiceInterface {
	
	@Autowired
	private DriverOnboardingRepo driverOnboardingRepo;
	
	public void submitDriverApplication(DriverApplicationDTO driverAppDTO) {
		driverOnboardingRepo.save(driverAppDTO.getDriver());
	}
}
