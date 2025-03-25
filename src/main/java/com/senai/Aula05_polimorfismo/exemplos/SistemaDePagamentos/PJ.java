package com.senai.Aula05_polimorfismo.exemplos.SistemaDePagamentos;

public class PJ extends Pagamentos{
    private double horasTrabalhadas;
    private double valorPorHora;

    public PJ(String nome, double horasTrabalhadas, double valorPorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas*valorPorHora;
    }
}
