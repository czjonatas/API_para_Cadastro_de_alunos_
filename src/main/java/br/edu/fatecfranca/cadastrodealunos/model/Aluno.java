package br.edu.fatecfranca.cadastrodealunos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // entidade de banco de dados
public class Aluno {

    @Id //chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String curso;
    private int idade;

    public Aluno() {
    }

    public Aluno(Long id, String nome, String curso, int idade) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
}
