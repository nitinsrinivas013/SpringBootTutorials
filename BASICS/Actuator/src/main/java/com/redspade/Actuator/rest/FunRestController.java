package com.redspade.Actuator.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to the server!";
    }

    @GetMapping("/home")
    public String homePage(){
        return "This is the home page";
    }

    @GetMapping("/weapon")
    public String weaponDisplay(){
        return "Wagwan my G! What kinda weapon you into my brother ?";
    }

}
