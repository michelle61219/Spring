package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	// Define a private field for the dependency (InterfaceName, varName)
	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it: " + fortuneService.getFortune();
	}
	
	/* Here are the personal custom methods that 
	 * get executed before and after the bean life cycle. (Hook) 
	 */
	
	// Add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// Add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}
