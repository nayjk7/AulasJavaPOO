package com.senai.aula03.encapsulamento.exemplo.carro;

public class Main {
    public static void main(String[] args) {
        //criando um objeto de classe carro
        Carro meuCarro = new Carro();


        //utilizando metodos publicos para modificar e acessar a variavel privada
        meuCarro.setVelocidade(100); //define a velocidade para 100
        //System.out.println("Velocidade atual: " + meuCarro.getVelocidade());

        //testando uma velocidade invalida
        //meuCarro.setVelocidade(-20); // isso mostrara uma mensagem de erro*/
        meuCarro.velocidade = 120; //agora funciona sem erro
        System.out.println("Velocidade modificada diretamente: " + meuCarro.velocidade);


    }
}
