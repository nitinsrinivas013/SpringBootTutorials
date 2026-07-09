package com.redspade.Qualifier.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Override
    public String getPractice(){
        return "Hit 20 crossbars and score 20 penalties!";
    }

}