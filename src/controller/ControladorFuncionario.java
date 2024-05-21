package controller;
import java.util.Date;
import model.Funcionario;
import service.FuncionarioService;

public class ControladorFuncionario {
    private FuncionarioService funcionarioService;

    public ControladorFuncionario(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    public void criarFuncionario(String nome, String cpf, Date dataDeNascimento, String cargo, String diasDisponiveis) {
        Funcionario funcionario = new Funcionario(nome, cpf, dataDeNascimento, cargo, diasDisponiveis);
        funcionarioService.adicionarFuncionario(funcionario);
    }

    public void registrarEntrada(int id) {
        funcionarioService.registrarEntrada(id);
    }

    public void registrarSaida(int id) {
        funcionarioService.registrarSaida(id);
    }

    public void listarFuncionarios() {
        funcionarioService.listarFuncionarios().forEach(funcionario -> {
            System.out.println("ID: " + funcionario.getId() + ", Nome: " + funcionario.getNome() + ", CPF: " + funcionario.getCpf());
        });
    }

    public void removerFuncionario(int id) {
        funcionarioService.removerFuncionario(id);
    }
}

