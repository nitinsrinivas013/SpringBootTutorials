package com.example.LazyInitialization.rest;


import com.example.LazyInitialization.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("footballCoach") Coach theCoach){

        System.out.println("In Constructor: " + getClass().getSimpleName());

        myCoach = theCoach;
    }

    @GetMapping("/practice")
    public String PracticeSesh(){
        return myCoach.getPractice();
    }

}
