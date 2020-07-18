package com.prac.spring.core.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Annotation-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        PoloCoach poloCoach = context.getBean("poloCoach", PoloCoach.class);
        // call methods on the bean
        System.out.println(theCoach.getDailtWorkout());
        System.out.println(theCoach.getDailyForture());


        System.out.println(poloCoach.getDailtWorkout());
        System.out.println(poloCoach.getDailyForture());
        System.out.println(poloCoach.getAge());
        System.out.println(poloCoach.getEmail());
        // close the context
        context.close();


    }
}
