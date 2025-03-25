package com.senai.Aula05_polimorfismo.exemplos.SistemaDePagamentos;

public class Freelancers extends Pagamentos{
    private double valorDoProjeto;

    public Freelancers(String nome, double valorDoProjeto) {
        super(nome);
        this.valorDoProjeto = valorDoProjeto;
    }

    @Override
    public double calcularPagamento() {
        return valorDoProjeto;
    }
}
