package com.prac.spring.core.xml;

public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("Inside default constrctor --- CricketCoach");
    }

    private FortuneService fortuneService;

    public CricketCoach(FortuneService theFortuneService) {
        System.out.println("Inside Parametrise constrctor --- CricketCoach");
        fortuneService = theFortuneService;
    }

    public String getDailyWorkout() {
        return "Practice your putting skills for 2 hours today";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    private void getStartupStuff() {
        System.out.println("Inside in-it method constrctor --- CricketCoach");
    }

    private void getCleanupStuff() {
        System.out.println("Inside destroy constrctor --- CricketCoach");
    }
}
