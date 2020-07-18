package com.prac.spring.core.annotation;

import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class PoloCoach implements Coach {

    @Value("${foo.email}")
    private String email;
    @Value("${foo.age}")
    private int age;

    /* By writing @Autowaire @Qualifier("") you can inject the dependency */
    private FortuneService service;

    /* this is setter injection */
    @Autowired
    @Qualifier("sadFortuneService")
    public void anyCrazzyStuff(FortuneService service) {
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
        return "Tight your gloves";
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
