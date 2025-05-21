package br.edu.fatecfranca.cadastrodealunos.controller.aluno;

import br.edu.fatecfranca.cadastrodealunos.model.Aluno;
import br.edu.fatecfranca.cadastrodealunos.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Aluno> listar() {
        return service.listaAlunos(); // CORRIGIDO
    }

    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) {
        return service.salvarAluno(aluno);
    }

    @DeleteMapping("/{id}")
    public String remover(@PathVariable Long id) {
        return service.removerAluno(id) ? "Aluno removido." : "Aluno não encontrado.";
    }

    @PutMapping("/{id}")
    public Optional<Aluno> atualizar(@PathVariable Long id, @RequestBody Aluno novo) {
        return service.atualizarAluno(id, novo);
    }
}
