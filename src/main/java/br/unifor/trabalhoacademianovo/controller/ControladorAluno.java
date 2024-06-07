package br.unifor.trabalhoacademianovo.controller;

import br.unifor.trabalhoacademianovo.model.Aluno;
import br.unifor.trabalhoacademianovo.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class ControladorAluno {
    private final AlunoService service;

    public ControladorAluno(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Aluno> listarAlunos() {
        return service.listarAlunos();
    }

    @PostMapping
    public void adicionarAluno(@RequestBody Aluno aluno) {
        service.matricularAluno(aluno);
    }

    @PutMapping("/{id}/renovar")
    public void renovarMatricula(@PathVariable int id) {
        service.renovarMatricula(id);
    }

    @PutMapping("/{id}/cancelar")
    public void cancelarMatricula(@PathVariable int id) {
        service.cancelarMatricula(id);
    }

    @DeleteMapping("/{id}")
    public void removerAluno(@PathVariable int id) {
        service.removerAluno(id);
    }
}
