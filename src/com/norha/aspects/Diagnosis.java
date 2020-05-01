package com.norha.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnosis {

	@Pointcut("execution(void com.norha.cars.ElectricCar.run())")
	public void run() {}
	
	
	@Around("run()")
	public void aroundAdvice(ProceedingJoinPoint jp) {
		System.out.println("Around Advice Initial Msg");
		
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Around Advice Later Msg");
	}
	
	
	
	

}
