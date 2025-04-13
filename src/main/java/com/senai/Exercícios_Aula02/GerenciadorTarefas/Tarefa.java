package com.senai.Exercícios_Aula02.GerenciadorTarefas;

public class Tarefa {
    private String nomeTarefa;
    private boolean concluida;

    public Tarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
        this.concluida = false;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluir() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return nomeTarefa + "- [" + (concluida? "concluída" : "pendente" + "]");
    }
}



