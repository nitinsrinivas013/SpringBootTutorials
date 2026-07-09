package com.redspade.Primary.common;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach{

    @Override
    public String getPractice(){
        return "Run a 5K mate!";
    }
}
