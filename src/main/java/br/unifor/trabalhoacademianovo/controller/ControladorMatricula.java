package br.unifor.trabalhoacademianovo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.unifor.trabalhoacademianovo.model.Aluno;
import br.unifor.trabalhoacademianovo.MatriculaFacade;

import java.util.List;

@RestController
@RequestMapping("/matricula")
public class ControladorMatricula {

    private final MatriculaFacade matriculaFacade;

    @Autowired
    public ControladorMatricula(MatriculaFacade matriculaFacade) {
        this.matriculaFacade = matriculaFacade;
    }

    @PostMapping
    public void matricularAluno(@RequestBody Aluno aluno) {
        matriculaFacade.matricularAluno(aluno);
    }

    @PutMapping("/{id}/renovar")
    public void renovarMatricula(@PathVariable int id) {
        matriculaFacade.renovarMatricula(id);
    }

    @DeleteMapping("/{id}")
    public void cancelarMatricula(@PathVariable int id) {
        matriculaFacade.cancelarMatricula(id);
    }

    @GetMapping("/{id}")
    public Aluno obterDetalhesAluno(@PathVariable int id) {
        return matriculaFacade.obterDetalhesAluno(id);
    }

    @GetMapping
    public List<Aluno> listarAlunos() {
        return matriculaFacade.listarAlunos();
    }

    @DeleteMapping("/remover/{id}")
    public void removerAluno(@PathVariable int id) {
        matriculaFacade.removerAluno(id);
    }
}
