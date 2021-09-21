package br.unisul.controlealunos.projprofalunos.repository;

import br.unisul.controlealunos.projprofalunos.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    Professor findFirstByNome(String nome);
}
