package service;
import model.Funcionario;
import repository.FuncionarioRepositorio;
import java.util.List;
import java.util.Optional;

public class FuncionarioService {
    private FuncionarioRepositorio repositorio;

    public FuncionarioService(FuncionarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void registrarEntrada(int id) {
        Optional<Funcionario> funcionario = repositorio.buscarFuncionarioPorId(id);
        funcionario.ifPresent(Funcionario::registrarEntrada);
    }

    public void registrarSaida(int id) {
        Optional<Funcionario> funcionario = repositorio.buscarFuncionarioPorId(id);
        funcionario.ifPresent(Funcionario::registrarSaida);
    }

    public List<Funcionario> listarFuncionarios() {
        return repositorio.listarFuncionarios();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        repositorio.adicionarFuncionario(funcionario);
    }

    public void removerFuncionario(int id) {
        repositorio.removerFuncionario(id);
    }
}

