package com.giacom.school.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class Student extends Person {
    private int rollNumber;
    private String registrationNumber;
    private List<Course> courses = new ArrayList<>();

    public Student(String name, Date birthDate, int rollNumber, String registrationNumber) {
        super(name, birthDate);
        this.rollNumber = rollNumber;
        this.registrationNumber = registrationNumber;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }
}
