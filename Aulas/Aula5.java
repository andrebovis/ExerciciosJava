package Aulas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Aulas.entities.Aluno;

public class Aula5 {

    private static List<Aluno> listaDeAlunos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--- Cadastro de Alunos em Memória (Exercício 5) ---");

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Remover Aluno");
            System.out.println("3. Listar Alunos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
                System.out.print("Escolha uma opção: ");
            }
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    removerAluno();
                    break;
                case 3:
                    listarAlunos();
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void adicionarAluno() {
        System.out.println("\n--- Adicionar Novo Aluno ---");
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        if (buscarAlunoPorMatricula(matricula) != null) {
            System.out.println("Erro: Já existe um aluno com a matrícula '" + matricula + "'.");
            return;
        }

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do aluno: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número para a idade.");
            scanner.next();
            System.out.print("Digite a idade do aluno: ");
        }
        int idade = scanner.nextInt();
        scanner.nextLine();

        Aluno novoAluno = new Aluno(matricula, nome, idade);
        listaDeAlunos.add(novoAluno);
        System.out.println("Aluno '" + nome + "' (Matrícula: " + matricula + ") adicionado com sucesso!");
    }

    public static void removerAluno() {
        System.out.println("\n--- Remover Aluno ---");
        if (listaDeAlunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado para remover.");
            return;
        }

        System.out.print("Digite a matrícula do aluno a ser removido: ");
        String matricula = scanner.nextLine();

        Aluno alunoParaRemover = buscarAlunoPorMatricula(matricula);

        if (alunoParaRemover != null) {
            listaDeAlunos.remove(alunoParaRemover);
            System.out.println("Aluno com matrícula '" + matricula + "' removido com sucesso!");
        } else {
            System.out.println("Erro: Aluno com matrícula '" + matricula + "' não encontrado.");
        }
    }

    public static void listarAlunos() {
        System.out.println("\n--- Lista de Alunos Cadastrados ---");
        if (listaDeAlunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado ainda.");
        } else {
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                Aluno aluno = listaDeAlunos.get(i);
                System.out.println((i + 1) + ". " + aluno.toString());
            }
        }
    }

    private static Aluno buscarAlunoPorMatricula(String matricula) {
        for (Aluno aluno : listaDeAlunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }
}