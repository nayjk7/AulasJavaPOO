package com.senai.Exercícios_Aula02.GerenciadorTarefas;

import java.util.Scanner;

public class Main {
    public static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            String menu = """
                    _________________________________________________________
                    |   Escolha uma opção:                                  |
                    |       1- Adicionar tarefa                             |
                    |       2- Listar Tarefas                               |
                    |       3- Marcar tarefa como concluída                 |
                    |       4- Remover Tarefa                               |
                    |       5- Sair                                         |
                    _________________________________________________________
                    
                    """;
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    listarTarefas();
                    break;
                case 3:
                    marcarTarefaConcluída();
                    break;
                case 4:
                    removerTarefa();
                    break;
                case 5:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
}
public static void adicionarTarefa() {
    }
    public static void listarTarefas() {

    }
    public static void marcarTarefaConcluída() {

    }
    public static void removerTarefa(){

    }
    String nãoQueroFazerNadaNessaMerda;
    int cansei;
            double queroMeMatar;
                    boolean socorro;

}


