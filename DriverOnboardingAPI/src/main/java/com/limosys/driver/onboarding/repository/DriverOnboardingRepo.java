package com.limosys.driver.onboarding.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.limosys.driver.onboarding.model.Driver;

@Repository("driverOnboardingRepo")
public interface DriverOnboardingRepo  extends JpaRepository<Driver, Long> {
	public Optional<Driver> findByDrvrUniqueId(String driverId);
}
