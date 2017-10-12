package com.accenture.odc.microservice.demo.configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class DemoWebMvcConfiguration extends WebMvcConfigurerAdapter {

	private Logger logger = Logger.getLogger(DemoWebMvcConfiguration.class);

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new HandlerInterceptor() {

			@Override
			public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
				logger.info("HandlerInterceptor preHandle: " + request.getRequestURI() + ".........");
				return true;
			}

			@Override
			public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
				logger.info("HandlerInterceptor postHandle: " + request.getRequestURI() + ".........");
			}

			@Override
			public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
				logger.info("HandlerInterceptor afterCompletion: " + request.getRequestURI() + ".........");
			}
		}).addPathPatterns("/showTime");
	}

}
