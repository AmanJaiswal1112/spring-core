package com.prac.spring.core.xml;

public class HockeyCoach implements Coach {
    public HockeyCoach() {
        System.out.println("Inside default constrctor --- HockeyCoach");
    }

    private String email;
    private int age;
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice on batting skills for 2 hours today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter mentod of FortuneService --- HockeyCoach");
        this.fortuneService = fortuneService;
    }
}
