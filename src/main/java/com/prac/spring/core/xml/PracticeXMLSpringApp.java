package com.prac.spring.core.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeXMLSpringApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCricCoach", Coach.class);
        HockeyCoach hockeyCoach = context.getBean("myHockCoach", HockeyCoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println(hockeyCoach.getDailyWorkout());
        System.out.println(hockeyCoach.getDailyFortune());
        System.out.println(hockeyCoach.getAge());
        System.out.println(hockeyCoach.getEmail());
        // close the context
        context.close();
    }
}
