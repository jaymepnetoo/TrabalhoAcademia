package service;
import model.Aluno;
import repository.AlunoRepositorio;
import java.util.List;
import java.util.Optional;

public class AlunoService {
    private AlunoRepositorio repositorio;

    public AlunoService(AlunoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void matricularAluno(Aluno aluno) {
        aluno.matricular();
        repositorio.adicionarAluno(aluno);
    }

    public void renovarMatricula(int id) {
        Optional<Aluno> aluno = repositorio.buscarAlunoPorId(id);
        aluno.ifPresent(Aluno::renovarMatricula);
    }

    public void cancelarMatricula(int id) {
        Optional<Aluno> aluno = repositorio.buscarAlunoPorId(id);
        aluno.ifPresent(Aluno::cancelarMatricula);
    }

    public List<Aluno> listarAlunos() {
        return repositorio.listarAlunos();
    }

    public void removerAluno(int id) {
        repositorio.removerAluno(id);
    }
}

