package com.limosys.driver.onboarding.config;

import static springfox.documentation.builders.PathSelectors.regex;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@PropertySources({
    @PropertySource(value = "classpath:application.properties"),
    @PropertySource(value = "classpath:driveronboarding.properties", ignoreResourceNotFound = true)
})

@EnableSwagger2
public class InitialSpringConfig implements WebMvcConfigurer {
	
	@Value("${driverOnboardApi.db.user}")
    private String user;
    
    @Value("${driverOnboardApi.db.password}")
    private String password;
    
    @Value("${driverOnboardApi.db.driverclassname}")
    private String driverClassName;
    
    @Value("${driverOnboardApi.db.url}")
    private String url;
    
    @Value("${driverOnboardApi.db.pool.max.size}")
    private String maxPoolSize;
    
    @Value("${driverOnboardApi.db.pool.min.idle}")
    private String minIdle;
    
    @Value("${driverOnboardApi.db.pool.idle.timeout.ms}")
    private String idleTimeout;
    
    @Value("${driverOnboardApi.db.pool.name}")
    private String poolName;
    
    /**
     * method to get app db datasource
     * @param  : void
     * @return : DataSource
     */
    @Bean
    @Primary
    public DataSource dataSourceDriverOnboard() throws Exception {   
    	
        
    	HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName(driverClassName);
        hikariConfig.setJdbcUrl(url);
        hikariConfig.setUsername(user);
        hikariConfig.setPassword(password);

        hikariConfig.setMaximumPoolSize( Integer.parseInt(maxPoolSize) );
        hikariConfig.setMinimumIdle( Integer.parseInt(minIdle) );
        hikariConfig.setIdleTimeout( Integer.parseInt(idleTimeout) );
        hikariConfig.setPoolName( poolName );
        HikariDataSource dataSource = new HikariDataSource(hikariConfig);

        if(dataSource == null){            
            throw new Exception(" The 'dataSource' cannot be null. ");
        }

       
        return dataSource;
    }// public DataSource dataSourceDriverOnboard
	
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
