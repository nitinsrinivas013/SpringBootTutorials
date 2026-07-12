package com.example.BeanScopes.common;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {

    @Override
    public String practiceSession(){
        return "Do 20 laps today!";
    }

}
