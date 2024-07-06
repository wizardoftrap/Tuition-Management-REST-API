package com.shivPrakash.Tuition_Manager.Repositories;
import com.shivPrakash.Tuition_Manager.Entities.Class;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ClassRepository extends JpaRepository<Class, Long> {
	List<Class> findBySubjectId(Long subjectId);
	List<Class> findByStudentsId(@Param("studentsId")Long studentsId);
}
