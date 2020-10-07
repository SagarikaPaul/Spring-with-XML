package com.sagarika.spring.Sports;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
 public static void main (String args[]) {
	 
	 String newLine = System.getProperty("line.separator");
	 
	 //-------------------------SINGLETON SCOPE and PROTOTYPE SCOPE------------------------//
	 	//load the spring configuration file
	 	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean ("myCoach", Coach.class);
		Coach alphaCoach = context.getBean ("myCoach", Coach.class);
		
		//check if they are same
		boolean result = (theCoach == alphaCoach);
		
		//Print the results 
		System.out.print("pointing the same result------" + result + newLine);
		System.out.print("print the object reference of theCoach------ " + theCoach + newLine);
		System.out.print("print the object referenece of aplhaCoach------- " + alphaCoach + newLine);
		
		//close the context
		context.close();
	
 }
}
