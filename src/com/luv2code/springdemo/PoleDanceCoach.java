package com.luv2code.springdemo;

public class PoleDanceCoach implements Coach {
	
	// Define a private field for the dependency (InterfaceName, varName)
	private FortuneService fortuneService;
	
	public PoleDanceCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Climb the pole !!!";
	}

	@Override
	public String getDailyFortune() {
		return "Pole Dance Fortune: " + fortuneService.getFortune();
	}

}
