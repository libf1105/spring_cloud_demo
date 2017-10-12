package com.accenture.odc.microservice.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DemoBeanConfiguration {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	// @Bean
	// public ServiceOneServiceFallback getServiceOneServiceFallback() {
	// return new ServiceOneServiceFallback();
	// }

}
