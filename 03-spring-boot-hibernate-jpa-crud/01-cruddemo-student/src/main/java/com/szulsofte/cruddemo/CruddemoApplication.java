package com.szulsofte.cruddemo;

import com.szulsofte.cruddemo.dao.StudentDAO;
import com.szulsofte.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
		//	createStudent(studentDAO);
		//	createMultipleStudents(studentDAO);

		readStudent(studentDAO);
		};
	}

	private void readStudent(StudentDAO studentDAO) {

		// create a student object

		System.out.println("Createing new student object...");
		Student tempStudent = new Student("Tytus", "Bomba", "kapitan@bomba.pl");

		// save the student

		System.out.println(("Saving the student..."));
		studentDAO.save(tempStudent);

		// display id of the saved student

		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated id: " + theId);

		// retrieve student basen on th id: primary key

		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		// display student

		System.out.println("Found the student: " + myStudent);

	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		// create multiple students

		System.out.println("Crateing 3 student objects...");
		Student tempStudent1 = new Student("Imbir", "Szul", "imbir@szul.com");
		Student tempStudent2 = new Student("Paulina", "Lacka", "paulina@lacka.com");
		Student tempStudent3 = new Student("Example", "Person", "example@person.com");

		// save the student object

		System.out.println("Saving the students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void createStudent(StudentDAO studentDAO) {

		//create the student object
		System.out.println("Crating new student object...");
		Student tempStudent = new Student("Karol", "Szul", "karol@szul.com");

		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}

}
