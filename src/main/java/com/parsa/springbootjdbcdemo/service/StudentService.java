package com.parsa.springbootjdbcdemo.service;

import com.parsa.springbootjdbcdemo.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public void addStudent(Student student) {
        System.out.println("adding student");
    }
}
