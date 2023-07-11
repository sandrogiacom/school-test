package com.giacom.escola.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professor extends Pessoa {
    private String especializacao;
    private String matricula;
    private List<Curso> cursos;

    public Professor(String name, LocalDate birthDate, String especializacao, String matricula) {
        super(name, birthDate);
        this.especializacao = especializacao;
        this.matricula = matricula;
    }
}
