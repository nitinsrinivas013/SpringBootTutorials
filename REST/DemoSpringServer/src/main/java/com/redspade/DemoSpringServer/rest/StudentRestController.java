package com.redspade.DemoSpringServer.rest;

import com.redspade.DemoSpringServer.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        if(studentId >= getStudentList().size() || (studentId < 0)){
            throw new StudentNotFoundException("Student Id not found - " + studentId);
        }
        return studentList.get(studentId);
    }

    // Add exception handler to catch the exception thrown above

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e){

        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(e.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
