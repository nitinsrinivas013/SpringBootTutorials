package com.redspade.Qualifier.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getPractice(){
        return "Hit 12 sixes in 20 balls!";
    }

}
