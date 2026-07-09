package com.redspade.myFirstApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // defined in application.properties

    @Value("${victim.name}")
    private String victim;

    @Value("${assaulter.name}")
    private String killer;

    @GetMapping("/news")
    public String latestNews(){
        return
                killer +
                " has struck again and this time he's snatched the soul of none other than the infamous "
                + victim + ".";
    }



    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
    // new endpoint

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a 5K!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day lad!";
    }
}
