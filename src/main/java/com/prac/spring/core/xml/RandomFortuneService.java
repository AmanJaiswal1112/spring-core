package com.prac.spring.core.xml;

import org.springframework.beans.factory.DisposableBean;

import java.util.Random;

public class RandomFortuneService implements FortuneService, DisposableBean {
    // create an array of strings

    public RandomFortuneService() {
        System.out.println("Inside default constrctor --- RandomFortuneService");
    }

    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    // create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        // pick a random string from the array
        int index = myRandom.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy constrctor --- RandomFortuneService");
    }

    private void getStartupStuff() {
        System.out.println("Inside in-it method constrctor --- RandomFortuneService");
    }
}
