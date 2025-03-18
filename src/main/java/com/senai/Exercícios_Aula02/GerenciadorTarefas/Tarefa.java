package com.senai.Exercícios_Aula02.GerenciadorTarefas;

import java.util.Scanner;

public class Tarefa {
    String nomeTarefa;
    boolean status;

    public Tarefa(String nomeTarefa, boolean status) {
        this.nomeTarefa = nomeTarefa;
        this.status = status;
    }

    public static void adicionarTarefa() {
        System.out.println("Adicione a tarefa");
        Scanner input = new Scanner(System.in);
        System.out.println("Ver tarefa");
        String nomeTarefa = input.nextLine();
        System.out.println(nomeTarefa);

    }
    public static void listarTarefas() {

    }
    public static void marcarTarefaConcluída() {

    }
    public static void removerTarefa(){

    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nomeTarefa='" + nomeTarefa + '\'' +
                ", status=" + status +
                '}';
    }
}


