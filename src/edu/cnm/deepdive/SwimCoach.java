package edu.cnm.deepdive;

public class SwimCoach implements Coach {


  @Override
  public String getDailyWorkout() {
    return "swim 500 meters free style";
  }

  @Override
  public String getDailyFortune() {
    return null;
  }
}
