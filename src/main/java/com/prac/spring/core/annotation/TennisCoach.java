package com.prac.spring.core.annotation;

import com.prac.spring.core.annotation.Coach;
import com.prac.spring.core.annotation.FortuneService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class TennisCoach implements Coach, DisposableBean {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier("happyFortureService") FortuneService fortuneService1) {
        fortuneService = fortuneService1;
    }

    @Override
    public String getDailtWorkout() {
        return "Practice your short selection";
    }

    @Override
    public String getDailyForture() {
        return "Inside HappyFortureService class :" + fortuneService.getFortune();
    }

    @PostConstruct
    private void getStartupStuff() {
        System.out.println("Inside in-it method constrctor --- TennisCoach");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy constrctor --- TennisCoach");
    }
}
