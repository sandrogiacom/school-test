package com.giacom;

import com.giacom.escola.domain.Aluno;
import com.giacom.escola.domain.Contato;
import com.giacom.escola.domain.Curso;
import com.giacom.escola.domain.Professor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

class SchoolSystemTest {
    private Aluno aluno;
    private Professor professor;
    private Curso curso;

    @BeforeEach
    public void setup() {
        // Create a student
        aluno = new Aluno("John Doe", LocalDate.of(2009, 12, 25), "S12345");
        Contato contato = new Contato("aaa@aaa.com", "11123323");
        aluno.setContato(List.of(contato));

        // Create a teacher
        professor = new Professor("Mr. Johnson", LocalDate.of(1982, 10, 5), "Mathematics", "T98765");

        // Create a course
        curso = new Curso("Mathematics", professor);
        curso.setIdadeMinima(10);
    }

    @Test
    public void testEnrollStudentInCourse() {
        // Enroll student in course
        curso.matricularAluno(aluno);

        // Verify that student is enrolled in the course
        Assertions.assertTrue(curso.getAlunos().contains(aluno));
        Assertions.assertTrue(aluno.getCursos().contains(curso));
    }


}