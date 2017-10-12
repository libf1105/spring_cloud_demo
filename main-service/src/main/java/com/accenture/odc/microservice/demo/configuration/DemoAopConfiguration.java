package com.accenture.odc.microservice.demo.configuration;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAopConfiguration {

	private Logger logger = Logger.getLogger(DemoAopConfiguration.class);

	@Pointcut("execution(* com.accenture.odc.microservice.demo.controller.MainServiceController.showServiceOneTime(..))")
	public void pointcut() {
	}

	@Around("pointcut()")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		logger.info("aop: eneter method " + pjp.getSignature().getName() + ".........");
		Object result = pjp.proceed();
		logger.info("aop: leave method " + pjp.getSignature().getName() + ".........");
		return result;
	}

}
