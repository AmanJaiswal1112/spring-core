package com.prac.spring.core.config;

import com.prac.spring.core.config.Coach;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        // load the spring configuration file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // retrieve bean from spring container
        Coach theCoach = context.getBean("swimCoach", Coach.class);

        System.out.println(theCoach.getDailtWorkout());
        System.out.println(theCoach.getDailyForture());
        // close the context
        context.close();


    }
}
