package com.redspade.ConstructorInjection;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Override
    public String getDailyPractice(){
        return "Hit 20 crossbars mate, no skimmers allowed!";
    }

}
