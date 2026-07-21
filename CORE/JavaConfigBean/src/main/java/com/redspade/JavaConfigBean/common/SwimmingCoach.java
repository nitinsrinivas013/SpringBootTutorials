package com.redspade.JavaConfigBean.common;


public class SwimmingCoach implements Coach{

    public SwimmingCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getPractice(){
        return "Swim 1000 meters as a warm up!";
    }
}
