package com.example.BeanScopes.common;

import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach{

    @Override
    public String practiceSession(){
        return "Hit a hole-in-one!";
    }
}

