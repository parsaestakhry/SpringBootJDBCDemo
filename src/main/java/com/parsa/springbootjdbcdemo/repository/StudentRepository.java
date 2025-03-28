package com.parsa.springbootjdbcdemo.repository;


import com.parsa.springbootjdbcdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student) {
        String sql = "INSERT INTO student(rollNo,name,marks) VALUES(?,?,?)";
        int rows = jdbcTemplate.update(sql, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println("rows affected:" + rows);
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM student";
        RowMapper<Student> mapper = (rs, rowNum) -> {
                Student student = new Student();
                student.setRollNo(rs.getInt("rollNo"));
                student.setName(rs.getString("name"));
                student.setMarks(rs.getInt("marks"));

                return student;

        };
        return jdbcTemplate.query(sql, mapper);
    }
}
