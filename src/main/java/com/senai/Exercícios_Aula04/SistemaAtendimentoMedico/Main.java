package com.senai.Exercícios_Aula04.SistemaAtendimentoMedico;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new PacienteParticular("Ana", 24, 250);
        Paciente paciente2 = new PacienteParticular("Bruno", 26, 300);

        Paciente paciente3 = new PacienteConvenio("Marina", 45, 300, 10);
        Paciente paciente4 = new PacienteConvenio("João", 65, 300, 15);

        System.out.println("Paciente Particular: ");
        paciente1.exibirDetalhes();
        System.out.println();
        paciente2.exibirDetalhes();

        System.out.println();

        System.out.println("Paciente Convênio: ");
        paciente3.exibirDetalhes();
        System.out.println();
        paciente4.exibirDetalhes();
    }
}
