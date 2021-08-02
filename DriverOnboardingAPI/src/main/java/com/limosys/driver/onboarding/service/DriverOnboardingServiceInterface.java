package com.limosys.driver.onboarding.service;

import com.limosys.driver.onboarding.dto.DriverApplicationDTO;


public interface DriverOnboardingServiceInterface {
	public void submitDriverApplication(DriverApplicationDTO driverAppDTO) throws Exception;

}
