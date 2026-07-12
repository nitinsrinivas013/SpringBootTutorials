package com.example.BeanLifecycle.rest;

import com.example.BeanLifecycle.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach headCoach;

    @Autowired
    public DemoController(Coach coach1){
        headCoach = coach1;
    }

    @GetMapping("/workout")
    public String Practice(){
        return headCoach.getPractice();
    }
}
