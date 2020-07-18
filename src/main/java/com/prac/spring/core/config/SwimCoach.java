package com.prac.spring.core.config;

import com.prac.spring.core.config.Coach;
import com.prac.spring.core.config.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SwimCoach implements Coach {

    @Value("${foo.email}")
    private String email;
    @Value("${foo.age}")
    private int age;

    /* By writing @Autowaire @Qualifier("") you can inject the dependency */
    private FortuneService service;

    @Autowired
    public SwimCoach(@Qualifier("sadFortuneService") FortuneService service) {
        this.service = service;
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

    @Override
    public String getDailtWorkout() {
        return "swim 100m as a warm up";
    }

    @PostConstruct
    private void getStartupStuff() {
        System.out.println("Inside in-it method constrctor --- PoloCoach");
    }

    @PreDestroy
    private void getCleanupStuff() {
        System.out.println("Inside destroy constrctor --- PoloCoach");
    }

    @Override
    public String getDailyForture() {
        return service.getFortune();
    }
}
