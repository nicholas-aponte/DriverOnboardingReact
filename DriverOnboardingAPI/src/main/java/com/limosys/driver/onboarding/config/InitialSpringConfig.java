package com.limosys.driver.onboarding.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@PropertySources({
    @PropertySource(value = "classpath:application.properties"),
    //@PropertySource(value = "classpath:driveronboarding.properties", ignoreResourceNotFound = true)
})

@EnableSwagger2
public class InitialSpringConfig implements WebMvcConfigurer {
	@Bean
    public Docket driverOnboardingDocket() { 
		
		/*
		 * 
		 *  ParameterBuilder parameterBuilder1 = new ParameterBuilder();
        		parameterBuilder1.name(ApplicationConstant.PARAM_CLIENT_ID)                
                         .modelRef(new ModelRef("string"))
                         .parameterType("header")               
                         .required(true)                
                         .build();
		 */
       
      return new Docket(DocumentationType.SWAGGER_2)
    		  .apiInfo(apiInfo())
              .select()
              .apis(RequestHandlerSelectors.basePackage("com.limosys.driver.onboarding"))
              .paths(regex("/.*"))            
              .build();
              //.globalOperationParameters(parameters);
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("LimoSys Driver Onboarding Master API")
                .description("LimoSys Driver Onboarding Master API")
                .version("1")
                .build();
                
    }
}
