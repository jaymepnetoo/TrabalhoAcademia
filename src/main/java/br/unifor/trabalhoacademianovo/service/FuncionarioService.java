package br.unifor.trabalhoacademianovo.service;

import br.unifor.trabalhoacademianovo.model.Funcionario;
import br.unifor.trabalhoacademianovo.repository.FuncionarioRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    private final FuncionarioRepositorio repositorio;

    public FuncionarioService(FuncionarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void registrarEntrada(int id) {
        Funcionario funcionario = repositorio.findById(id).orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));
        funcionario.registrarEntrada();
        repositorio.save(funcionario);
    }

    public void registrarSaida(int id) {
        Funcionario funcionario = repositorio.findById(id).orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));
        funcionario.registrarSaida();
        repositorio.save(funcionario);
    }

    public List<Funcionario> listarFuncionarios() {
        return repositorio.findAll();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        repositorio.save(funcionario);
    }

    public void removerFuncionario(int id) {
        repositorio.deleteById(id);
    }
}
