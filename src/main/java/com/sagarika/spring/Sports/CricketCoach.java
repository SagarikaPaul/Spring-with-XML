package com.sagarika.spring.Sports;

public class CricketCoach implements Coach {

	private String email;
	private String team;
	
	//define a private field for dependency
	private FortuneService fortuneService1;
	
	// default constructor
	public CricketCoach() {
	}

	//setter method for dependency injection
	public void setFortuneServices(FortuneService fortuneService) {
		this.fortuneService1 = fortuneService;
	}
	
	public String getDailyWorkout() {
	return "warm up for 30 mins";
	}
	
	//dependency
	public String getDailyFortune() {
		return fortuneService1.getFortune();
	}
	
	
	
	
	// Injecting literal values
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Inside the setter method --- set email");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside the setter method --- set team");
		this.team = team;
	}
}
