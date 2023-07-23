package com.giacom.escola.persistense.impl;

import com.giacom.escola.domain.Aluno;
import com.giacom.escola.persistense.EscolaPersistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EscolaPersistenceImpl implements EscolaPersistence {

    @Override
    public Aluno createAluno(Aluno aluno) {
        String databaseUrl = "jdbc:sqlite:db/escola.db";

        try (Connection conn = DriverManager.getConnection(databaseUrl);
             Statement stmt = conn.createStatement()) {

            String sql = "INSERT INTO Pessoa (nome, sobrenome, dataNascimento, genero, cidade) " +
                    "VALUES ('" + aluno.getNome() + "', '" + aluno.getSobrenome() + "','" + aluno.getDataNascimento() + "','" +
                    aluno.getGenero() + "','" + aluno.getEndereco().getCidade() + "')";

            // Execute the query
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return aluno;
    }


}
