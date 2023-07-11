package com.giacom.escola.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Aluno extends Pessoa {
    private String numeroMatricula;
    private List<Curso> cursos = new ArrayList<>();

    public Aluno(String name, LocalDate dataNascimento, String numeroMatricula) {
        super(name, dataNascimento);
        this.numeroMatricula = numeroMatricula;
    }

    public void matricularCurso(Curso curso) {
        cursos.add(curso);
    }
}
