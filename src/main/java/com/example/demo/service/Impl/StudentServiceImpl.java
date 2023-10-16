package com.example.demo.service.Impl;


import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImpl {

    @Autowired
    private StudentMapper studentMapper;

    public int insert(Student student) {
        int insert = studentMapper.insert(student);
        return insert;
    }
}
