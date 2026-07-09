package com.redspade.Qualifier.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getPractice(){
        return "Run a hard 5K!";
    }

}