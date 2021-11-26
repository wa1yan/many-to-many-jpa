package com.example.demomanytomany.service;

import com.example.demomanytomany.entities.Student;
import com.example.demomanytomany.entities.Subject;
import com.example.demomanytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Transactional
    public void createDB(){
        Student s1 = new Student("Willaim","11","ISM");
        Student s2 = new Student("Suzan","12","IBM");
        Student s3 = new Student("Htet","13","ICM");

        Subject subjects1 = new Subject("Biology","3 months");
        Subject subjects2 = new Subject("Python","2 months");
        Subject subjects3 = new Subject("Spring","4 months");

        s1.addSubject(subjects1);
        s1.addSubject(subjects2);
        s1.addSubject(subjects3);

        s2.addSubject(subjects1);
        s2.addSubject(subjects2);

        s3.addSubject(subjects2);
        s3.addSubject(subjects3);

        studentRepository.save(s1);
        studentRepository.save(s2);
        studentRepository.save(s3);

    }
}
