package com.senai.aula03.encapsulamento.exemplo.carro;

public class Carro {
    public int velocidade;

    //contrutor da classe
    public Carro() {
        velocidade = 0; //inicialmente o carro está parado

    }
    //metodo publico para obter a velocidade (getter)
    public int getVelocidade() {
        return velocidade;
    }
    //metodo publico para definir a velocidade (setter)
    public void setVelocidade(int velocidade) {
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        } else {
            System.out.println("Velocidade inválida!");
        }
    }
}
