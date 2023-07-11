package com.giacom.escola.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private List<Contato> contato;
    private Genero genero;
    private Endereco endereco;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.contato = new ArrayList<>();
    }

    public int getIdade() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dataNascimento, currentDate).getYears();
    }
}
