import controller.ControladorAluno;
import controller.ControladorFuncionario;
import repository.AlunoRepositorio;
import repository.FuncionarioRepositorio;
import service.AlunoService;
import service.FuncionarioService;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Instancia os repositórios
        AlunoRepositorio alunoRepositorio = new AlunoRepositorio();
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioRepositorio();

        // Instancia os serviços
        AlunoService alunoService = new AlunoService(alunoRepositorio);
        FuncionarioService funcionarioService = new FuncionarioService(funcionarioRepositorio);

        // Instancia os controladores
        ControladorAluno controladorAluno = new ControladorAluno(alunoService);
        ControladorFuncionario controladorFuncionario = new ControladorFuncionario(funcionarioService);

        // Criar e matricular um aluno
        controladorAluno.criarAluno("João Silva", "123.456.789-00", new Date(), "Mensal");
        controladorAluno.listarAlunos();

        // Criar e adicionar um funcionário
        controladorFuncionario.criarFuncionario("Maria Santos", "987.654.321-00", new Date(), "Instrutor", "Segunda a Sexta");
        controladorFuncionario.listarFuncionarios();

        // Registrar entrada de um funcionário
        controladorFuncionario.registrarEntrada(1);
        controladorFuncionario.registrarSaida(1);
    }
}
