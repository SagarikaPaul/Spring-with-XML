package com.sagarika.spring.Sports;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
		
		public static void main (String args[]) {
		    String newLine = System.getProperty("line.separator");
		   
			// ****************BOTH FOR CONSTRUCTOR INJECTION AND SETTER INJECTION*****************
			
			//load the spring configuration file
			//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			//retrieve bean from spring container
			//Coach theCoach = context.getBean ("myCoach", Coach.class);
			
			//call method on the bean
			//System.out.println(theCoach.getDailyWorkout() + newLine);
			
			//call the dependency
			//System.out.print(theCoach.getDailyFortune() + newLine);
			
			//close context
			//context.close();
			
			
			
			
			// *****************************INJECTING LITRERAL VALUES********************************
			
			//load the config file
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			// retrieve bean from spring container
			CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
			//print method on the bean
			System.out.print(theCricketCoach.getDailyWorkout() + newLine);
			//print dependency
			System.out.print(theCricketCoach.getDailyFortune() + newLine);
			//print injected literal values
			System.out.print(theCricketCoach.getEmail() + newLine);
			System.out.print(theCricketCoach.getTeam() + newLine);
			//close context
			context.close();
			
		}
}

	