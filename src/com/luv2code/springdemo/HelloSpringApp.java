/*
 * My first Spring App
 */
package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Call methods on the beans
		System.out.println(theCoach.getDailyWorkout());
		
		//Call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		context.close();
	}

}
