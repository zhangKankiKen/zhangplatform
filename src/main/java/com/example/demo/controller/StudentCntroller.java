package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.Impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class StudentCntroller {

    @Autowired
    private StudentServiceImpl studentService;


    @PostMapping("/test")
    public int test(@RequestBody Student student){
        int insert = studentService.insert(student);
        return insert;
    }
}
