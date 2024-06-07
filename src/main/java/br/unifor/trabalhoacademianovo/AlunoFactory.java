package br.unifor.trabalhoacademianovo;

import java.util.Date;
//import java.sql.Date;

import br.unifor.trabalhoacademianovo.model.Aluno;

public class AlunoFactory {

    public static Aluno criarAluno(String nome, String cpf, Date dataDeNascimento, String tipoMatricula) {
        return new Aluno(nome, cpf, dataDeNascimento, tipoMatricula);
    }
}
