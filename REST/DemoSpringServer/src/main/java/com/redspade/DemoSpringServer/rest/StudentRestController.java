package com.redspade.DemoSpringServer.rest;

import com.redspade.DemoSpringServer.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> studentList;

    @PostConstruct
    public void loadData(){

        studentList = new ArrayList<>();

        studentList.add(new Student("Nitin", "Srinivas"));
        studentList.add(new Student("Thor", "Odinson"));
        studentList.add(new Student("Doctor", "Strange"));
        studentList.add(new Student("Hulk", "Smash"));


    }


    @GetMapping("/students")
    public List<Student> getStudentList(){
        return studentList;
    }

    // define endpoint -> "/students/{studentId}" - return a student by the index

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        return studentList.get(studentId);

    }






}
