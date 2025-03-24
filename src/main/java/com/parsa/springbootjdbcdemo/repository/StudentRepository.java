package com.parsa.springbootjdbcdemo.repository;


import com.parsa.springbootjdbcdemo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    public void save(Student student) {

    }

    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        return studentList;
    }
}
