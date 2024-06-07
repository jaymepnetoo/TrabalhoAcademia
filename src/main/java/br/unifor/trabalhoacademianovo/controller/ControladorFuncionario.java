package br.unifor.trabalhoacademianovo.controller;

import br.unifor.trabalhoacademianovo.model.Funcionario;
import br.unifor.trabalhoacademianovo.service.FuncionarioService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class ControladorFuncionario {
    private final FuncionarioService service;

    public ControladorFuncionario(FuncionarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Funcionario> listarFuncionarios() {
        return service.listarFuncionarios();
    }

    @PostMapping
    public void adicionarFuncionario(@RequestBody Funcionario funcionario) {
        service.adicionarFuncionario(funcionario);
    }

    @PutMapping("/{id}/entrada")
    public void registrarEntrada(@PathVariable int id) {
        service.registrarEntrada(id);
    }

    @PutMapping("/{id}/saida")
    public void registrarSaida(@PathVariable int id) {
        service.registrarSaida(id);
    }

    @DeleteMapping("/{id}")
    public void removerFuncionario(@PathVariable int id) {
        service.removerFuncionario(id);
    }
}
