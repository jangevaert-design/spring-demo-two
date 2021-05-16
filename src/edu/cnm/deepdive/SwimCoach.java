package edu.cnm.deepdive;

public class SwimCoach implements Coach {

  private FortuneService fortuneService;

  public SwimCoach(FortuneService theFortuneService) {
    this.fortuneService = theFortuneService;
  }

  public SwimCoach() {

  }


  @Override
  public String getDailyWorkout() {
    return "swim 500 meters free style";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}
