package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return this.studentService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable long id){
        return this.studentService.getStudentById(id);
    }

//    @PostMapping("/student")
//    public void addStudent(@RequestParam Student student){
//        this.studentService.addStudent(student);
//    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable long id){
        this.studentService.deleteStudent(id);
    }

}
