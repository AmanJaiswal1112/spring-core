package com.prac.spring.core.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeXmlBeanLifeCycleSpringApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("BeanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricCoach", CricketCoach.class);

        // call methods on the bean

        // close the context
        context.close();


    }
}
