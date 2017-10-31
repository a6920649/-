package com.svgteam.SpringDemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.svgteam.service.StudentService;


public class MainDemo {
	@Test
	public void test() {
		//基于spring和Aspect整合的前后置通知实例
		ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService s=ctx.getBean(StudentService.class);
		s.insert();
	}
}
