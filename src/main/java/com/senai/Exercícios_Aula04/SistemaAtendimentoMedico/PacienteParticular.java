package com.senai.Exercícios_Aula04.SistemaAtendimentoMedico;

public class PacienteParticular extends Paciente {
    double custoConsulta;

    public PacienteParticular(String nome, int idade, double custoConsulta) {
        super(nome, idade);
        this.custoConsulta = custoConsulta;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Custo consulta: R$" + custoConsulta);
    }
}
