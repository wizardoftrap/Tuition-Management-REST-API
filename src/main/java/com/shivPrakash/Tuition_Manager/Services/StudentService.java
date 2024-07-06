package com.shivPrakash.Tuition_Manager.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivPrakash.Tuition_Manager.Entities.Student;
import com.shivPrakash.Tuition_Manager.Repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }
    public List<Student> getStudentsByName(String name) {
        return studentRepository.findByName(name);
    }
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
