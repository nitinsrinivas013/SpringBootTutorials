package com.redspade.Primary.rest;

import com.redspade.Primary.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;


    // By default, TennisCoach class's object gets assigned to theCoach as it has the @primary annotation

    @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/practice")
    public String PracticeSesh(){
        return myCoach.getPractice();
    }
}
