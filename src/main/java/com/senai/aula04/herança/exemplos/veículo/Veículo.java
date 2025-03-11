package com.senai.aula04.herança.exemplos.veículo;

public class Veículo {
    String marca;
    int ano;

    public Veículo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;

    }
    void exibirDetalhes(){
        System.out.println("Marca:" + marca + ", Ano: " + ano);
    }
}
