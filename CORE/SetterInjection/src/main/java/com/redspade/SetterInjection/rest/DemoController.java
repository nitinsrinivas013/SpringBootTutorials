package com.redspade.SetterInjection.rest;


import com.redspade.SetterInjection.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public void setterFunction(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/workout")
    public String Practice(){
        return myCoach.getDailyWorkout();
    }
}
