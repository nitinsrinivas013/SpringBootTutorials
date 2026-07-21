package com.redspade.JavaConfigBean.rest;


import com.redspade.JavaConfigBean.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach headCoach;

    @Autowired
    public DemoController(@Qualifier("myBeanId") Coach coach1){

        System.out.println("In Constructor: " + getClass().getSimpleName());

        headCoach = coach1;
    }

    @GetMapping("/practice")
    public String Practice(){
        return headCoach.getPractice();
    }

}
