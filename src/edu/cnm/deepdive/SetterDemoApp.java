package edu.cnm.deepdive;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

  public static void main(String[] args) {
    // load the spring configuration file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    //retrieve the bean from the container
    CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
    //call methods on the bean
    System.out.println("\n" + theCoach.getDailyWorkout());
    System.out.println();
    System.out.println(theCoach.getDailyFortune());
    //close the context
    context.close();
  }

}
