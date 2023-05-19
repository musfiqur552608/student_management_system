package com.freedu.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.freedu.main.entity.*;
import com.freedu.main.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Musfiqur", "Rahman", "musfiq@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Sakibur", "Rahman", "sakib@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Ripa", "Rahman", "ripa@gmail.com");
//		studentRepository.save(student3);
		
	}

}
