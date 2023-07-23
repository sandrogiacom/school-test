package com.giacom.escola.service;

import com.giacom.escola.domain.Aluno;
import com.giacom.escola.domain.Endereco;
import com.giacom.escola.domain.Genero;
import com.giacom.escola.persistense.impl.EscolaPersistenceImpl;
import org.assertj.core.api.Assertions;
import org.instancio.Instancio;
import org.instancio.Model;
import org.junit.jupiter.api.Test;

import static org.instancio.Select.all;
import static org.instancio.Select.field;

class AlunoServiceTest {

    private AlunoService alunoService;

    @Test
    void create() {
        alunoService = new AlunoService(new EscolaPersistenceImpl());

        Model<Aluno> simpsons = Instancio.of(Aluno.class)
                .set(field(Aluno::getSobrenome), "Simpson")
                .set(field(Endereco::getCidade), "Springfield")
                .generate(field(Aluno::getDataNascimento), gen -> gen.temporal().localDate().past())
                .toModel();

        Aluno homer = Instancio.of(simpsons)
                .set(field(Aluno::getNome), "Homer")
                .set(all(Genero.class), Genero.MASCULINO)
                .create();

        Aluno marge = Instancio.of(simpsons)
                .set(field(Aluno::getNome), "Marge")
                .set(all(Genero.class), Genero.FEMININO)
                .create();

        Aluno aluno = alunoService.create(homer);
        Aluno aluno1 = alunoService.create(marge);

        Assertions.assertThat(aluno).isEqualTo(homer);
        Assertions.assertThat(aluno1).isEqualTo(marge);

    }
}