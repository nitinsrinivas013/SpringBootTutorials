package com.example.LazyInitialization.common;


import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    public FootballCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getPractice(){
        return "Score a hat-trick against Manchester United!";
    }
}
