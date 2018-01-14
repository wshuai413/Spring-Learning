package com.shiyanlou.demo.loosely_coupled;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Spring-Output.xml");
		
		OutputHelper obj = (OutputHelper) context.getBean("OutputHelper");
		obj.generateOutput();
	}
	
}
