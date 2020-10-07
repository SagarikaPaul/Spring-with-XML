package com.sagarika.spring.Sports;

public class TrackCoach implements Coach {

	//default constructor
	public TrackCoach() {
		
	}
	
	//define a private field for dependency
	private FortuneService fortuneService1;
	
	//define a constructor for dependency injection
	public TrackCoach (FortuneService theFortuneService) {
		fortuneService1 = theFortuneService;
	}

	public String getDailyWorkout() {
		return "run 2k";
	}

	// dependency or helper
	public String getDailyFortune() {
		return fortuneService1.getFortune();
	}
}

