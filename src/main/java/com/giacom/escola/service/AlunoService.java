package com.giacom.escola.service;

import com.giacom.escola.domain.Aluno;
import com.giacom.escola.persistense.EscolaPersistence;

public class AlunoService {

    private EscolaPersistence persistence;

    public AlunoService(EscolaPersistence persistence) {
        this.persistence = persistence;
    }

    public Aluno create(Aluno aluno) {
        return persistence.createAluno(aluno);
    }

}
