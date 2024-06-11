package br.unifor.trabalhoacademianovo;

import br.unifor.trabalhoacademianovo.model.Aluno;
import br.unifor.trabalhoacademianovo.service.AlunoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MatriculaFacade {

    private final AlunoService alunoService;

    @Autowired
    public MatriculaFacade(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    public void matricularAluno(Aluno aluno) {
        alunoService.matricularAluno(aluno);
    }

    public void renovarMatricula(int id) {
        alunoService.renovarMatricula(id);
    }

    public void cancelarMatricula(int id) {
        alunoService.cancelarMatricula(id);
    }

    public Aluno obterDetalhesAluno(int id) {
        return alunoService.obterDetalhesAluno(id);
    }

    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    public void removerAluno(int id) {
        alunoService.removerAluno(id);
    }
}
