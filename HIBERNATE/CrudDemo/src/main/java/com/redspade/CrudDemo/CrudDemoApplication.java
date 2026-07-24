package com.redspade.CrudDemo;

import com.redspade.CrudDemo.dao.StudentDAO;
import com.redspade.CrudDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return args -> {
			createStudent(studentDAO);
		};
	}

	public void createStudent(StudentDAO newStudent){

		System.out.println("Creating new student object....");
		Student student1 = new Student("Nitin", "Srinivas", "nitinsrinivas13@gmail.com");

		newStudent.save(student1);

		System.out.println("Saved Student - Generated ID: " + student1.getId());
	}

}
