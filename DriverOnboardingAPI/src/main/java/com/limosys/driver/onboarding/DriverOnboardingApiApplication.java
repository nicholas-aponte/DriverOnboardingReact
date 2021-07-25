package com.limosys.driver.onboarding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;


@SpringBootApplication
public class DriverOnboardingApiApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(DriverOnboardingApiApplication.class, args);
	}
}
