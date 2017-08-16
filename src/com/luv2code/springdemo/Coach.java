/* Interface to make the program takes in different type of coaches. 
 * (Not just the baseball coach)
 */
package com.luv2code.springdemo;

public interface Coach {

	//Just specification of what's available, not how to implement
	public String getDailyWorkout();
	
	public String getDailyFortune();
}
