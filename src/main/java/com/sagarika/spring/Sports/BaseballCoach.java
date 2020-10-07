package com.sagarika.spring.Sports;

	public class BaseballCoach implements Coach {
		
		//default constructor
		public BaseballCoach() {
			
		}
		
		//define a private field for dependency
		private FortuneService fortuneService1;
		
		//define a constructor for dependency injection
		public BaseballCoach (FortuneService theFortuneService) {
			fortuneService1 = theFortuneService;
		}

		public String getDailyWorkout() {	
			return "batting for 20 mins";
		}

		// dependency or helper 
		public String getDailyFortune() {
			return fortuneService1.getFortune();
		}

		
		
		
}
