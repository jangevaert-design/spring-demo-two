package edu.cnm.deepdive;

public class TrackCoach implements Coach{

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5 k";
  }

  @Override
  public String getDailyFortune() {
    return null;
  }
}
