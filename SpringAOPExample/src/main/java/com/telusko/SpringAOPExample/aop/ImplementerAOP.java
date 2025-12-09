package com.telusko.SpringAOPExample.aop;

import java.time.LocalTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ImplementerAOP 
{
//	@Before(value="execution(* com.telusko.SpringAOPExample.rest.*.*(..))")
	@Before(value="execution(* com.telusko.SpringAOPExample.rest.ImplementerController.*(..))")
	public void  beforeAdvice(JoinPoint joinPoint)
	{
		System.out.println("Request made to "+ joinPoint.getSignature() +" at "+LocalTime.now());
	}
	
	@After(value="execution(* com.telusko.SpringAOPExample.rest.ImplementerController.*(..))")
	public void afetrAdvice(JoinPoint joinPoint)	
	{
		System.out.println("Request made to "+ joinPoint.getSignature() +" at "+LocalTime.now());
	}
	
	@Before(value="execution(* com.telusko.SpringAOPExample.service.ImplementerService.*(..))")
	public void  beforeAdviceService(JoinPoint joinPoint)
	{
		System.out.println("Request made to "+ joinPoint.getSignature() +" at "+LocalTime.now());
	}
	
	@After(value="execution(* com.telusko.SpringAOPExample.service.ImplementerService.*(..))")
	public void afetrAdviceService(JoinPoint joinPoint)	
	{
		System.out.println("Request made to "+ joinPoint.getSignature() +" at "+LocalTime.now());
	}
	
	@AfterThrowing(value="execution(* com.telusko.SpringAOPExample.service.ImplementerService.*(..))"
			,throwing="exception")
	public void afetrAdviceService(JoinPoint joinPoint,RuntimeException exception)	
	{
		System.out.println("Response Came from  "+ joinPoint.getSignature() +" at "+LocalTime.now()
		+" and exception is "+ exception.getMessage());
	}
	
	
}
