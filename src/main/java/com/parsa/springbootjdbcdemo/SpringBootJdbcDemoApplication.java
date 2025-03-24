package com.parsa.springbootjdbcdemo;

import com.parsa.springbootjdbcdemo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcDemoApplication {

//    we are assuming that this is client
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootJdbcDemoApplication.class, args);
        Student student = context.getBean(Student.class);
        student.setRollNo(101);
        student.setMarks(53);
        student.setName("max");
    }

}
