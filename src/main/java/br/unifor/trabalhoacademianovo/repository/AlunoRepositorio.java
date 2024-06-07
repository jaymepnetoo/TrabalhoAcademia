package br.unifor.trabalhoacademianovo.repository;

import br.unifor.trabalhoacademianovo.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Integer> {
}
