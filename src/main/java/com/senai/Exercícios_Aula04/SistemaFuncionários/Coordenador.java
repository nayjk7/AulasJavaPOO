package com.senai.Exercícios_Aula04.SistemaFuncionários;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionário{
    private List<Professor> equipeProfessores;

    public Coordenador(String nome, double salario, List<Professor> equipeProfessores) {
        super(nome, salario);
        this.equipeProfessores = equipeProfessores;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Equipe de professores:");
       for (Professor professor : equipeProfessores) {
           System.out.println("-" + professor.nome + "(Disciplina:" + professor.disciplina + ")");

        }

    }
}

