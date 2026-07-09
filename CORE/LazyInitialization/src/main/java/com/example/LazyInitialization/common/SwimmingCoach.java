package com.example.LazyInitialization.common;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SwimmingCoach implements Coach {

    public SwimmingCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getPractice(){
        return "Stay under-water for 8 minutes, dont die!";
    }
}
