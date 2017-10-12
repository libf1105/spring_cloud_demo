package com.accenture.odc.microservice.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.accenture.odc.microservice.demo.service.ServiceOneService;

@RestController
@RefreshScope
public class MainServiceController {

	@Value("${demo.var}")
	private String demoVar;

	@Autowired
	private ServiceOneService serviceOneService;

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/showEnvironment")
	public String showEnvironment() {
		return demoVar;
	}

	@RequestMapping("/showTime")
	public String showServiceOneTime() {
		return serviceOneService.getTime();
	}

	@RequestMapping("/showTimeByRest")
	public String showServiceOneTimeByRest() {
		return restTemplate.getForObject("http://localhost:8020/getTime", String.class);
	}
}
