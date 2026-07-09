package com.redspade.Qualifier.common;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach{

    @Override
    public String getPractice(){
        return "Do 15 laps!";
    }

}
