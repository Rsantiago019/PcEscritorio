package com.example.crudrapido.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.crudrapido.demo.Service.StudentService;
import com.example.crudrapido.demo.entity.Student;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public void saveUpdate(@RequestBody Student student) {
        studentService.saveOrUpdate(student);
    }

    @GetMapping("/{studentId}")
    public Optional<Student> getById(@PathVariable("studentId") Long studentId) {
    return studentService.getStudentById(studentId);
}


    @DeleteMapping("/{studentId}")
    public void delete(@PathVariable("studentId") Long studentId) {
        studentService.delete(studentId);
    }
}
