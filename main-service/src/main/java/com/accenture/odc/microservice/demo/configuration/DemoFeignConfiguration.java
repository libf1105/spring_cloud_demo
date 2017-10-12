package com.accenture.odc.microservice.demo.configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Retryer;
import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class DemoFeignConfiguration {

	@Bean
	public Retryer configFeignRetryer() {
		return new Retryer.Default(100, SECONDS.toMillis(1), 1);
	}

	@Bean
	public BasicAuthRequestInterceptor configFeignAuthRequestInterceptor() {
		return new BasicAuthRequestInterceptor("user", "user");
	}
}
