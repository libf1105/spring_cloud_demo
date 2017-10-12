package com.accenture.odc.microservice.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.accenture.odc.microservice.demo.zuulfilter.DemoZuulFilter;
import com.netflix.zuul.ZuulFilter;

@Configuration
public class DemoZuulFilterConfiguration {

	@Bean
	public ZuulFilter getZuulFilter() {
		return new DemoZuulFilter();
	}

}
