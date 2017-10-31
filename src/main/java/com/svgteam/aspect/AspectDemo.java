package com.svgteam.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectDemo {
	Long time;
	
	
	
	
	public AspectDemo() {
		System.out.println("切面类被创建");
	}


	//前置通知
//	@Before("execution(* com.svgteam.service.impl.*.*(..))")//A第一种  单用前后置 打开/关闭 否则与环绕冲突
	public void beforeAdvice() {
		System.out.println("事务开始");
		time=System.currentTimeMillis();
	}
	
	
	//后置通知
//	@After("execution(* com.svgteam.service.impl.*.*(..))")//A第一种  单用前后置 打开/关闭 否则与环绕冲突
	public void afterAdvice() {
		time=System.currentTimeMillis()-time;
		System.out.println("所消耗时间为："+time+"ms");
		System.out.println("事务关闭");
	}
	
	
	
	
	
	//环绕通知
	@Around("execution(* com.svgteam.service.impl.*.*(..))")
	public void AroundAdvice(ProceedingJoinPoint joinPoint) {
		System.out.println("调用环绕式通知");
		
		
		beforeAdvice();//前置
		
		try {
			joinPoint.proceed();//等同于method.invoke()
			
			afterAdvice();//后置
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
