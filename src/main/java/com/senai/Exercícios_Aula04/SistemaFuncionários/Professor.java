package com.senai.Exercícios_Aula04.SistemaFuncionários;

import java.util.ArrayList;

public class Professor extends Funcionário {
    String disciplina;


     public Professor(String nome, double salario, String disciplina) {
            super(nome, salario);
            this.disciplina = disciplina;

    }

    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Disciplina: " + disciplina);


    }
}
