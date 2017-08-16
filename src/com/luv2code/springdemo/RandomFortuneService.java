package com.luv2code.springdemo;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	// Create an array of strings
	private String []array = {"lucky", "unlucky", "normal"};
	
	// Create a random number generator
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		
		//Select out a random index in array
		int select = random.nextInt(array.length);
		String fortune = array[select];
		return fortune;
	}

}
