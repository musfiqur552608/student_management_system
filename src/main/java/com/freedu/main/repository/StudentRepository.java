package com.freedu.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freedu.main.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
