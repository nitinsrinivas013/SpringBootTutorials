package com.redspade.SetterInjection.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Do 50 push-ups today!";
    }
}
