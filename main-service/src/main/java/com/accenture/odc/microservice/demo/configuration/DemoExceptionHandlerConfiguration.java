package com.accenture.odc.microservice.demo.configuration;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.accenture.odc.microservice.demo.controller.DemoApplicationException;

@ControllerAdvice
public class DemoExceptionHandlerConfiguration {

	@ExceptionHandler(DemoApplicationException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public void processFancyApplicationException(DemoApplicationException ex, HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().println("<h1>Error!</h1>");
	}

}
