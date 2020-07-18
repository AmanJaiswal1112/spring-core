package com.prac.spring.core.annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortureService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is lucky day.";
    }
}
