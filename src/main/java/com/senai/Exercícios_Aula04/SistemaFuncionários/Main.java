package com.senai.Exercícios_Aula04.SistemaFuncionários;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Angela", 7000, "Biologia");
        Professor professor2 = new Professor("Carlos", 6500, "Matemática");
        Professor professor3 = new Professor("Leandro", 6000, "História");
        Professor professor4 = new Professor("Bruna", 7500, "Português");

        List<Professor> equipe1 = new ArrayList<>();
        equipe1.add(professor1);
        equipe1.add(professor2);

        List<Professor> equipe2 = new ArrayList<>();
        equipe2.add(professor3);
        equipe2.add(professor4);

        Coordenador coordenador1 = new Coordenador("Marina", 10000, equipe1);

        System.out.println();

        Coordenador coordenador2 = new Coordenador("Roger", 10000, equipe2);


        System.out.println("Detalhe dos professores");
        professor1.exibirDetalhes();
        System.out.println();
        professor2.exibirDetalhes();

        System.out.println("\nDetalhe do coordenador");
        coordenador1.exibirDetalhes();
        System.out.println();
        coordenador2.exibirDetalhes();

    }
}
