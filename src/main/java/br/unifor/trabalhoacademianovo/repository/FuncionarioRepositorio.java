package br.unifor.trabalhoacademianovo.repository;

import br.unifor.trabalhoacademianovo.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Integer> {
}
