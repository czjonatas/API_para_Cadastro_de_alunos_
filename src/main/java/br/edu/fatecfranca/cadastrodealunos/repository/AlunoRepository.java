package br.edu.fatecfranca.cadastrodealunos.repository;

import br.edu.fatecfranca.cadastrodealunos.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
