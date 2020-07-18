package com.prac.spring.core.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Annotation-applicationContext.xml");
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        Coach theCoach1 = context.getBean("poloCoach", Coach.class);
        Coach alphaCoach1 = context.getBean("poloCoach", Coach.class);

        boolean status = (theCoach == alphaCoach);
        System.out.println(" Both object reference =" + status);
        System.out.println(" Memory location for thecoach =" + theCoach);
        System.out.println(" Memory location for alphacoach =" + alphaCoach);
        // close the context
        context.close();
    }
}
