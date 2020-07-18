package com.prac.spring.core.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeXmlBeanScopeSpringApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");

        // retrieve bean from spring container

        System.out.println("Start .....");
        CricketCoach theCoach = context.getBean("myCricCoach", CricketCoach.class);
        CricketCoach hockeyCoach = context.getBean("myCricCoach", CricketCoach.class);

        boolean status = (theCoach == hockeyCoach);
        System.out.println(" Both object reference =" + status);
        // call methods on the bean

        // close the context
        context.close();

      /*  ClassPathXmlApplicationContext context1 =
                new ClassPathXmlApplicationContext("BeanScopeapplicationContext.xml");

        Coach theCoach1 = context1.getBean("myCricCoach", Coach.class);
        CricketCoach hockeyCoach1 = context1.getBean("myCricCoach", CricketCoach.class);

        boolean status1 = (theCoach1 == hockeyCoach1);
        System.out.println(" Both object reference ="+status1);
        // call methods on the bean

        // close the context
        context1.close();*/

    }
}
