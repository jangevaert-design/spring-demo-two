package edu.cnm.deepdive;

public class TrackCoach implements Coach{

  private FortuneService fortuneService;

  public TrackCoach(FortuneService thisFortuneService) {
    this.fortuneService = thisFortuneService;
  }

  public TrackCoach() {

  }

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5 k";
  }

  @Override
  public String getDailyFortune() {
    return "Just do it: " + fortuneService.getFortune();
  }

  // add an init method
  public void doMyStartupStuff() {
    System.out.println("\nTrackCoach: inside method doMyStartupStuff");
  }

  // add a destroy method
  public void doMyDestroyStuff() {
    System.out.println("\nTrackCoach: inside method doMyDestroyStuff");
  }
}
