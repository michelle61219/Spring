package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// Retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
			
		// Call the method
		System.out.println(theCoach.getDailyWorkout());
		
		// Close context
		context.close();	
	}
}
