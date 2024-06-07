package br.unifor.trabalhoacademianovo.service;

import br.unifor.trabalhoacademianovo.model.Aluno;
import br.unifor.trabalhoacademianovo.repository.AlunoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepositorio repositorio;

    public AlunoService(AlunoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void matricularAluno(Aluno aluno) {
        aluno.matricular();
        repositorio.save(aluno);
    }

    public void renovarMatricula(int id) {
        Aluno aluno = repositorio.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        aluno.renovarMatricula();
        repositorio.save(aluno);
    }

    public void cancelarMatricula(int id) {
        Aluno aluno = repositorio.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        aluno.cancelarMatricula();
        repositorio.save(aluno);
    }

    public List<Aluno> listarAlunos() {
        return repositorio.findAll();
    }

    public void removerAluno(int id) {
        repositorio.deleteById(id);
    }

   
}
