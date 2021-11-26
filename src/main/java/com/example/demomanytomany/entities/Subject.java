package com.example.demomanytomany.entities;

import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String duration;

    @ManyToMany
    List<Student> students = new ArrayList<>();

    public Subject() {
    }

    public Subject(String name, String duration) {
        this.name = name;
        this.duration = duration;
    }
}
