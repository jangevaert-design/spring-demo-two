package edu.cnm.deepdive;

public class MyApp {

  public static void main(String[] args) {
    // create the object
    Coach theCoach = new TrackCoach();
    //use the object
    System.out.println(theCoach.getDailyWorkout());
    System.out.println();

    Coach sportsCoach = new SwimCoach();
    System.out.println(sportsCoach.getDailyWorkout());
  }

}
