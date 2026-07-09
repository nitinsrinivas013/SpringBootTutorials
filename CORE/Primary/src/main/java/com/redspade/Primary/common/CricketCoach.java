package com.redspade.Primary.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getPractice(){
        return "Hit 6 sixes in 12 balls";
    }

}
