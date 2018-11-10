/**
 * 
 */
package com.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// AOP configuration

@Aspect
@Configuration
@Component
public class BeforeAspect { 
	
	private Logger LOGGER=LoggerFactory.getLogger(this.getClass());
	
	
	// Defined as
	// execution (* PACKAGE.*.*(..) )
	@Pointcut("execution(public com.example.aop.business.*.*(..))")
	public void before(JoinPoint joinPoint){
		LOGGER.info("**************** Check for user access **********");
		LOGGER.info("**************** Inceptor before **********",joinPoint);
	}
}
