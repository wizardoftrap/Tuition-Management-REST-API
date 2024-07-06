package com.shivPrakash.Tuition_Manager.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.shivPrakash.Tuition_Manager.Services.ClassService;
import com.shivPrakash.Tuition_Manager.Entities.Class;
import java.util.List;

@RestController
@RequestMapping("/tuition/classes")
public class ClassController {
    @Autowired
    private ClassService classService;

    @PostMapping("/add")
    public ResponseEntity<Class> createClass(@RequestBody Class cls) {
        Class savedClass = classService.saveClass(cls);
        return ResponseEntity.ok(savedClass);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Class>> getAllClasses() {
        List<Class> classes = classService.getAllClasses();
        return ResponseEntity.ok(classes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Class> getClassById(@PathVariable Long id) {
        return classService.getClassById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/subject/{subjectId}")
    public ResponseEntity<List<Class>> getClassesBySubject(@PathVariable Long subjectId) {
        List<Class> classes = classService.getClassesBySubject(subjectId);
        return ResponseEntity.ok(classes);
    }
    
    @GetMapping("/student/{studentsId}")
    public ResponseEntity<List<Class>> getClassesByStudent(@PathVariable Long studentsId) {
        List<Class> classes = classService.getClassesByStudent(studentsId);
        return ResponseEntity.ok(classes);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClass(@PathVariable Long id) {
        classService.deleteClass(id);
        return ResponseEntity.noContent().build();
    }
}
