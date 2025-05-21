package br.edu.fatecfranca.cadastrodealunos.service;

import br.edu.fatecfranca.cadastrodealunos.model.Aluno;
import br.edu.fatecfranca.cadastrodealunos.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private AlunoRepository repo;

    public AlunoService(AlunoRepository repo) {
        this.repo = repo;
    }

    public List<Aluno> listaAlunos() {
        return repo.findAll();
    }

    public Aluno salvarAluno(Aluno aluno) {
        return repo.save(aluno);
    }

    public boolean removerAluno(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<Aluno> atualizarAluno(Long id, Aluno novo) {
        return repo.findById(id).map(p -> {
            p.setNome(novo.getNome());
            p.setCurso(novo.getCurso());
            p.setIdade(novo.getIdade());
            return repo.save(p);
        });
    }
}
