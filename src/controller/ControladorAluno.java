package controller;
import model.Aluno;
import service.AlunoService;
import java.util.Date;

public class ControladorAluno {
    private AlunoService alunoService;

    public ControladorAluno(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    public void criarAluno(String nome, String cpf, Date dataDeNascimento, String tipoMatricula) {
        Aluno aluno = new Aluno(nome, cpf, dataDeNascimento, tipoMatricula);
        alunoService.matricularAluno(aluno);
    }

    public void renovarMatricula(int id) {
        alunoService.renovarMatricula(id);
    }

    public void cancelarMatricula(int id) {
        alunoService.cancelarMatricula(id);
    }

    public void listarAlunos() {
        alunoService.listarAlunos().forEach(aluno -> {
            System.out.println("ID: " + aluno.getId() + ", Nome: " + aluno.getNome() + ", CPF: " + aluno.getCpf());
        });
    }

    public void removerAluno(int id) {
        alunoService.removerAluno(id);
    }
}

