package com.example.demomanytomany;

import com.example.demomanytomany.service.StudentService;
import com.example.demomanytomany.util.JPAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoManyToManyApplication implements CommandLineRunner {

    @Autowired
    StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(DemoManyToManyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        studentService.createDB();

        JPAUtil.checkData("select * from student");
        JPAUtil.checkData("select * from subject");
       // JPAUtil.checkData("select * from student_subjects");
        JPAUtil.checkData("select * from subject_students");
    }
}
