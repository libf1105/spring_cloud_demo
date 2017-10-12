package com.accenture.odc.microservice.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

	private Logger logger = Logger.getLogger(ServiceOneController.class);

	@RequestMapping("/getTime")
	public String getTime() {
		logger.info("call getTime...");
		return "Service One Time: " + System.currentTimeMillis();
	}

}
