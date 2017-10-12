package com.accenture.odc.microservice.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accenture.odc.microservice.demo.configuration.DemoFeignConfiguration;

@FeignClient(name = "service-one", fallback = ServiceOneServiceFallback.class, configuration = DemoFeignConfiguration.class)
public interface ServiceOneService {

	@RequestMapping("/getTime")
	String getTime();

}
