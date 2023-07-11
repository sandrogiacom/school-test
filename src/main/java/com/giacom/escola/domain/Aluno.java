package com.giacom.escola.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Aluno extends Pessoa {
    private int rollNumber;
    private String registrationNumber;
    private List<Curso> cours = new ArrayList<>();

    public Aluno(String name, LocalDate dataNascimento, int rollNumber, String registrationNumber) {
        super(name, dataNascimento);
        this.rollNumber = rollNumber;
        this.registrationNumber = registrationNumber;
    }

    public void matricularCurso(Curso curso) {
        cours.add(curso);
    }
}
