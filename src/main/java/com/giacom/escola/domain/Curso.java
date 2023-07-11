package com.giacom.escola.domain;

import com.giacom.escola.exception.IdadeMinimaException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
    private String nome;
    private Professor professor;
    private List<Aluno> alunos;
    private int idadeMinima;

    public Curso(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno) {
        if (aluno.getIdade() < idadeMinima) {
            throw new IdadeMinimaException();
        }
        alunos.add(aluno);
        aluno.matricularCurso(this);
    }

}
