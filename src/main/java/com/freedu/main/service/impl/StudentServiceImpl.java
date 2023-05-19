package com.freedu.main.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.freedu.main.entity.Student;
import com.freedu.main.repository.StudentRepository;
import com.freedu.main.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}


	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}


	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

}
