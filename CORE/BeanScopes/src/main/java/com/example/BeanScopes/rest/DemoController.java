package com.example.BeanScopes.rest;

import com.example.BeanScopes.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach headCoach;
    private final Coach assistantCoach;

    @Autowired
    public DemoController(
            @Qualifier("footballCoach") Coach coach1,
            @Qualifier("footballCoach") Coach coach2
    ){
        headCoach = coach1;
        assistantCoach = coach2;
    }

    @GetMapping("/practice")
    public String Session(){
        return headCoach.practiceSession();
    }

    @GetMapping("/check")
    public String Check(){
        return "Comparing beans: headCoach == assistantCoach -> " + (headCoach == assistantCoach);
    }
}
