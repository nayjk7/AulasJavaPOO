package com.senai.Exercícios_Aula04.SistemaAtendimentoMedico;

public class PacienteConvenio extends Paciente{
     double custoBase;
     double desconto;

    public PacienteConvenio(String nome, int idade, double custobase, double desconto) {
        super(nome, idade);
        this.custoBase = custobase;
        this.desconto = desconto;
    }
    public double calcularValorFinal(){
        return custoBase - (custoBase * desconto/100);
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Custo base da consulta: R$" + custoBase);
        System.out.println("Desconto:" + desconto + "%");
        System.out.println("Valor final da consulta: R$" + calcularValorFinal() );
    }
}




