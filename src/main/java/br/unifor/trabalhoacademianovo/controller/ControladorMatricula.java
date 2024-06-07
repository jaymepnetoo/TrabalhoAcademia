package br.unifor.trabalhoacademianovo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.unifor.trabalhoacademianovo.model.Aluno;
import br.unifor.trabalhoacademianovo.service.AlunoService;

@RestController
@RequestMapping("/matricula")
public class ControladorMatricula {

    private final AlunoService alunoService;

    @Autowired
    public ControladorMatricula(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public void matricularAluno(@RequestBody Aluno aluno) {
        alunoService.matricularAluno(aluno);
    }
}
