package com.redspade.Calculator.rest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String calculator() {
        return "calculator";
    }
}