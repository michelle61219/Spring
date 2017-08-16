package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// Retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// Print out the results
		System.out.println("\n Pointinf to the same object: " + result);
		System.out.println("\n Memory location for theCoach: " + theCoach);
		System.out.println("\n Memory location for alphaCoach: " + alphaCoach + "\n");
		
		// Close context
		context.close();	
	}

}
