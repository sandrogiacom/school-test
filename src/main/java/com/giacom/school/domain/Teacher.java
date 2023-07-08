package com.giacom.school.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends Person {
    private String specialization;
    private String employeeId;
    private List<Course> courses;

    public Teacher(String name, Date birthDate, String specialization, String employeeId) {
        super(name, birthDate);
        this.specialization = specialization;
        this.employeeId = employeeId;
    }
}
