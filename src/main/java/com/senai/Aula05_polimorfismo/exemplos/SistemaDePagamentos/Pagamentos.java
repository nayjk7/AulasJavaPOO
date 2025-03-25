package com.senai.Aula05_polimorfismo.exemplos.SistemaDePagamentos;

public class Pagamentos {
    private String nome;

    public Pagamentos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double calcularPagamento(){
        return 0.0;
    }
}
