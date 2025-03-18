package com.senai.Exercícios_Aula04.SistemaFuncionários;

import java.util.ArrayList;

public class Professor extends Funcionário {
    private String disciplina;

     private static ArrayList<Professor> ListaDeProfessores = new ArrayList<>();

     public Professor(String nome, double salario, String disciplina) {
            super(nome, salario);
            this.disciplina = disciplina;

        ListaDeProfessores.add(this);

    }

    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Disciplina: " + disciplina);


    }
}
