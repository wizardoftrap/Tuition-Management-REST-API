package com.shivPrakash.Tuition_Manager.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivPrakash.Tuition_Manager.Entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
	List<Subject> findByName(String name);
}