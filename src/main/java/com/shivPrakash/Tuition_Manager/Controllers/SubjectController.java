package com.shivPrakash.Tuition_Manager.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.shivPrakash.Tuition_Manager.Entities.Subject;
import com.shivPrakash.Tuition_Manager.Services.SubjectService;

import java.util.List;

@RestController
@RequestMapping("/tuition/subjects")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @PostMapping("/add")
    public ResponseEntity<Subject> createSubject(@RequestBody Subject subject) {
        Subject savedSubject = subjectService.saveSubject(subject);
        return ResponseEntity.ok(savedSubject);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Subject>> getAllSubjects() {
        List<Subject> subjects = subjectService.getAllSubjects();
        return ResponseEntity.ok(subjects);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Subject> getSubjectById(@PathVariable Long id) {
        return subjectService.getSubjectById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/name/{name}")
    public ResponseEntity<List<Subject>> getSubjectsByName(@PathVariable String name) {
        List<Subject> subjects = subjectService.getSubjectsByName(name);
        return ResponseEntity.ok(subjects);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSubject(@PathVariable Long id) {
        subjectService.deleteSubject(id);
        return ResponseEntity.noContent().build();
    }
}
