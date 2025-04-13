package com.senai.Exercícios_Aula02.GerenciadorTarefas;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- Menu de Tarefas ---");
            System.out.println("1. Adicionar");
            System.out.println("2. Listar");
            System.out.println("3. Concluir");
            System.out.println("4. Remover");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome da tarefa: ");
                    String nomeTarefa= scanner.nextLine();
                    tarefas.add(new Tarefa(nomeTarefa));
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    System.out.println("Tarefas:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Número da tarefa para concluir: ");
                    int indexConcluir = scanner.nextInt() - 1;
                    if (indexConcluir >= 0 && indexConcluir < tarefas.size()) {
                        tarefas.get(indexConcluir).concluir();
                        System.out.println("Tarefa concluída!");
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Número da tarefa para remover: ");
                    int indexRemover = scanner.nextInt() - 1;
                    if (indexRemover >= 0 && indexRemover < tarefas.size()) {
                        tarefas.remove(indexRemover);
                        System.out.println("Tarefa removida.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    }


