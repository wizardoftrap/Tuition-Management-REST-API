package com.shivPrakash.Tuition_Manager.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivPrakash.Tuition_Manager.Entities.Subject;
import com.shivPrakash.Tuition_Manager.Repositories.SubjectRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public Optional<Subject> getSubjectById(Long id) {
        return subjectRepository.findById(id);
    }
    public List<Subject> getSubjectsByName(String name) {
        return subjectRepository.findByName(name);
    }
    public void deleteSubject(Long id) {
        subjectRepository.deleteById(id);
    }
}
