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
			// createStudent(studentDAO);
			//createMultipleStudents(studentDAO);

			readStudent(studentDAO);
		};
	}

	public void readStudent(StudentDAO studentDAO) {

		// Creating a new student object
		System.out.println("Creating a new student...");
		Student newStudent = new Student("Nitin", "Srinivas", "nitindrajesh7@gmail.com");

		// Saving the created student object to the database
		System.out.println("Saving the new student to the database...");
		studentDAO.save(newStudent);

		// Display the id of the saved student
		int theId = newStudent.getId();
		System.out.println("The student ID is: " + theId);

		// Retrieving the student object from the database
		System.out.println("Retrieving student with the ID: " + theId);
		Student myStudent = studentDAO.findById(theId);

		// Display student
		System.out.println("Student Found: " + myStudent);


	}

	public void createMultipleStudents(StudentDAO studentDAO) {

		System.out.println("Creating 3 student objects....");

		Student student2 = new Student("John", "Cena" , "johncena13@gmail.com");
		Student student3 = new Student("Jon", "Snow", "kinginthenorth@gmail.com");
		Student student4 = new Student("Erling", "Haaland", "viking@gmail.com");

		System.out.println("Saving the students....");

		studentDAO.save(student2);
		studentDAO.save(student3);
		studentDAO.save(student4);
	}

	public void createStudent(StudentDAO newStudent){

		System.out.println("Creating new student object....");
		Student student1 = new Student("Nitin", "Srinivas", "nitinsrinivas13@gmail.com");

		newStudent.save(student1);

		System.out.println("Saved Student - Generated ID: " + student1.getId());
	}



}
