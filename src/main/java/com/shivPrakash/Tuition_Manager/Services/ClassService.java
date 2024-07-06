package com.shivPrakash.Tuition_Manager.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivPrakash.Tuition_Manager.Repositories.ClassRepository;
import com.shivPrakash.Tuition_Manager.Entities.Class;
import java.util.List;
import java.util.Optional;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public Class saveClass(Class cls) {
        return classRepository.save(cls);
    }

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }
    public List<Class> getClassesBySubject(Long subjectId) {
        return classRepository.findBySubjectId(subjectId);
    }

    public Optional<Class> getClassById(Long id) {
        return classRepository.findById(id);
    }
    public List<Class> getClassesByStudent(Long studentsId) {
        return classRepository.findByStudentsId(studentsId);
    }
    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}