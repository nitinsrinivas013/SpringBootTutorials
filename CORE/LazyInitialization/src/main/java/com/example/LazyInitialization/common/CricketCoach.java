package com.example.LazyInitialization.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getPractice(){
        return "Take a 5 wicket-haul";
    }
}
