package com.example.springaop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(public * com.example.springboot.controller.AlienController.aliens())")
	public void logBefore() {
		LOGGER.info("getAliens method called from aspect");
	}
	
	//After annotation is used after finally block and AfterReturning is used after the method executed successfully without entering the catch block
	@After("execution(public * com.example.springboot.controller.AlienController.aliens())")
	public void logAfter() {
		LOGGER.info("executes after finally");
	}
	
	@AfterReturning("execution(public * com.example.springboot.controller.AlienController.aliens())")
	public void logAfterReturn() {
		LOGGER.info("executes after the methode executed successfully without any error");
	}
	
	@AfterThrowing("execution(public * com.example.springboot.controller.AlienController.aliens())")
	public void logAfterThrow() {
		LOGGER.info("executes after catch block");
	}
	
}
