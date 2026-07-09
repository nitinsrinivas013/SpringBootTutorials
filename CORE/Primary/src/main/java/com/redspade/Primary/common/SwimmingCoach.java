package com.redspade.Primary.common;


import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach{

    @Override
    public String getPractice(){
        return "Do 10 laps!";
    }

}
