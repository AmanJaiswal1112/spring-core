package com.prac.spring.core.config;

import com.prac.spring.core.config.FortuneService;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is sad day";
    }
}
