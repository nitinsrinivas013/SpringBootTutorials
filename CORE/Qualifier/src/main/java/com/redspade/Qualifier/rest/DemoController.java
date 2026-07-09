package com.redspade.Qualifier.rest;


import com.redspade.Qualifier.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("footballCoach") Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/practice")
    public String PracticeMethod(){
        return myCoach.getPractice();
    }
}
