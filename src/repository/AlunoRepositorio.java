package repository;
import model.Aluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AlunoRepositorio {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Optional<Aluno> buscarAlunoPorId(int id) {
        return alunos.stream().filter(aluno -> aluno.getId() == id).findFirst();
    }

    public List<Aluno> listarAlunos() {
        return new ArrayList<>(alunos);
    }

    public void removerAluno(int id) {
        alunos.removeIf(aluno -> aluno.getId() == id);
    }
}
