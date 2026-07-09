package com.redspade.Primary.common;


import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Override
    public String getPractice(){
        return "Hit 10 crossbars and 20 penalties!";
    }

}