package com.redspade.GlobalExceptionHandling.rest;


import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {

    private final List<String> students = new ArrayList<>();

    @PostConstruct
    public void loadData(){
        students.add("Nitin");
        students.add("Thor");
        students.add("Hulk");
        students.add("SpiderMan");
        students.add("SuperMan");
        students.add("BatMan");
    }

    @GetMapping("/students")
    public List<String> getStudentList(){
        return students;
    }

    @GetMapping("/students/{studentID}")
    public String getStudentListByID(@PathVariable int studentID){

        if(studentID < 0 || studentID >= students.size()){
            throw new CustomExceptionHandling("Student ID not found " + studentID);
        }
        return students.get(studentID);
    }

}
