package com.giacom.escola.domain;

import org.instancio.Instancio;
import org.instancio.Model;
import org.junit.jupiter.api.Test;

import static org.instancio.Select.all;
import static org.instancio.Select.field;

class AlunoTest {


    @Test
    public void test() {
//        List<Person> persons = Instancio.ofList(Person.class).size(10).create();

//        Stream<Person> personsStream = Instancio.stream(Person.class);
//        List<Person> list = personsStream.toList();

//        System.out.println(persons);

//        Pessoa pessoa = Instancio.of(Pessoa.class)
//                .generate(field(Pessoa::getDataNascimento), gen -> gen.temporal().localDate().past())
//                .create();


//        Pessoa pessoa = Instancio.of(Pessoa.class)
//                .set(field(Pessoa::getNome), "João")
//                .create();

//        Pessoa pessoa  = Instancio.of(Pessoa.class)
//                .supply(all(LocalDate.class), () -> LocalDate.now())
//                .create();

//        Pessoa pessoa = Instancio.of(Pessoa.class)
//                .onComplete(all(Pessoa.class), (Pessoa p) ->
//                        p.setNome(p.getGenero() == Genero.MASCULINO ? "João" : "Maria"))
//                .create();
//
//
//        System.out.println(pessoa);

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


        System.out.println(homer);
        System.out.println(marge);


    }

}