package com.example.LazyInitialization.common;


import org.springframework.stereotype.Component;

@Component
public class PokemonCoach implements Coach {

    public PokemonCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getPractice(){
        return "Catch Arceus";
    }
}

