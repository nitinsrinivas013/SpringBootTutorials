package com.example.BeanScopes.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String practiceSession(){
        return "Hit 100 sixes today!";
    }

}
