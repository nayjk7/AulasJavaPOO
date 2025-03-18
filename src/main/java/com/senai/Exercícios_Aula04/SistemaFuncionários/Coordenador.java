package com.senai.Exercícios_Aula04.SistemaFuncionários;

public class Coordenador extends Funcionário{
    private String equipeProfessores;

    public Coordenador(String nome, double salario, String equipeProfessores) {
        super(nome, salario);
        this.equipeProfessores = equipeProfessores;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Equipe de professores" + equipeProfessores);
    }
}
