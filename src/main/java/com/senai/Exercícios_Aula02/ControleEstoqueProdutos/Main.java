package com.senai.Exercícios_Aula02.ControleEstoqueProdutos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> Produto = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- Controle de Estoque ---");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Atualizar Quantidade");
            System.out.println("4. Remover Produto");
            System.out.println("5. Buscar Produto");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int qtd = scanner.nextInt();
                    Produto.add(new Produto(nome, qtd));
                    System.out.println("Produto cadastrado com sucesso!");
                }
                case 2 -> {
                    System.out.println("\nLista de Produtos:");
                    for (Produto p : Produto) {
                        System.out.println(p);
                    }
                }
                case 3 -> {
                    System.out.print("Digite o nome do produto para atualizar: ");
                    String nome = scanner.nextLine();
                    boolean encontrado = false;
                    for (Produto p : Produto) {
                        if (p.getNome().equalsIgnoreCase(nome)) {
                            System.out.print("Digite a nova quantidade: ");
                            int novaQtd = scanner.nextInt();
                            p.setQuantidade(novaQtd);
                            System.out.println("Quantidade atualizada com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) System.out.println("Produto não encontrado.");
                }
                case 4 -> {
                    System.out.print("Digite o nome do produto para remover: ");
                    String nome = scanner.nextLine();
                    Produto.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
                    System.out.println("Produto removido com sucesso!");
                }
                case 5 -> {
                    System.out.print("Digite o nome do produto para buscar: ");
                    String nome = scanner.nextLine();
                    for (Produto p : Produto) {
                        if (p.getNome().equalsIgnoreCase(nome)) {
                            System.out.println("Produto encontrado:");
                            System.out.println(p);
                            break;
                        }
                    }
                }
                case 6 -> System.out.println("Saindo do programa...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 6);
    }
}


