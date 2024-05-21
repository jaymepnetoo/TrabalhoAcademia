package repository;
import model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FuncionarioRepositorio {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public Optional<Funcionario> buscarFuncionarioPorId(int id) {
        return funcionarios.stream().filter(funcionario -> funcionario.getId() == id).findFirst();
    }

    public List<Funcionario> listarFuncionarios() {
        return new ArrayList<>(funcionarios);
    }

    public void removerFuncionario(int id) {
        funcionarios.removeIf(funcionario -> funcionario.getId() == id);
    }
}
