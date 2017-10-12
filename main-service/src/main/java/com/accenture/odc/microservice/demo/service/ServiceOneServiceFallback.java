package com.accenture.odc.microservice.demo.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceOneServiceFallback implements ServiceOneService {

	@Override
	public String getTime() {
		return "Local Time: " + System.currentTimeMillis();
	}

}
