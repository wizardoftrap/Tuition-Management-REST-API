package com.shivPrakash.Tuition_Manager.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivPrakash.Tuition_Manager.Entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	 List<Student> findByName(String name);
}