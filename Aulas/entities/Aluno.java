package Aulas.entities;

public class Aluno {
    private String matricula;
    private String nome;
    private int idade;

    public Aluno(String matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nome: " + nome + ", Idade: " + idade;
    }
}