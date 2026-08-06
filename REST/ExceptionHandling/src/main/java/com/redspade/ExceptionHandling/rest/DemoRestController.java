package com.redspade.ExceptionHandling.rest;


import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoRestController {

    private final List<String> Students = new ArrayList<>();

    @PostConstruct
    public void loadData(){
        Students.add("Nitin");
        Students.add("Hulk");
        Students.add("Thor");
        Students.add("SpiderMan");
        Students.add("Doom");
        Students.add("Doctor");
    }

    @GetMapping("/students")
    public List<String> studentList(){
        return Students;
    }

    @GetMapping("/students/{index}")
    public String getStudentByIndex(@PathVariable int index){

        if(index < 0 || index >= Students.size()){
            throw new CustomExceptionHandler("Student ID not found " + index);
        }
        return Students.get(index);
    }

    @ExceptionHandler
    public ResponseEntity<CustomErrorResponse> handleException(CustomExceptionHandler exception){

        CustomErrorResponse error = new CustomErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setTimeStamp(System.currentTimeMillis());
        error.setMessage(exception.getMessage());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

}
