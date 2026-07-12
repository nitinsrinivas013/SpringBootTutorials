package com.example.BeanLifecycle.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{


    @PostConstruct
    public void init(){
        System.out.println("Initialisation: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("Destroy: " + getClass().getSimpleName());
    }


    @Override
    public String getPractice(){
        return "Get 25 wickets today!";
    }

}
