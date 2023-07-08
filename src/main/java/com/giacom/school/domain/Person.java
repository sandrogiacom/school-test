package com.giacom.school.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private Date birthDate;
    private List<Contact> contact;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.contact = new ArrayList<>();
    }
}
