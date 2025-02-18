package com.senai.Exercícios_Aula01.GerenciamentoAlunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno1 = new Aluno("Nayara", 19, 8.5);
        Aluno aluno2 = new Aluno("Daniele", 16, 9.0);
        Aluno aluno3 = new Aluno("Bruno", 17, 5.0);


        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();

        System.out.println("\nAtualizar nota de qual aluno (Nayara, Daniele ou Bruno)? ");
        String nome = scanner.nextLine();

        System.out.println("Nota atualizada:");
        double notaAtualizada = scanner.nextDouble();

        if (nome.equalsIgnoreCase("Nayara")) aluno1.atualizarNota(notaAtualizada);
        else if (nome.equalsIgnoreCase("Daniele")) aluno2.atualizarNota(notaAtualizada);
        else if (nome.equalsIgnoreCase("Bruno")) aluno3.atualizarNota(notaAtualizada);

        System.out.println("\nNotas atualizadas:");
        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();

        scanner.close();
        }

    }



