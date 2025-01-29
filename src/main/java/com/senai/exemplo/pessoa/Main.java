package com.senai.exemplo.pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Nay", 19 );
        Endereco endereco = new Endereco("Pau Darco Roxo", 22, "Jardim Pedro José Nunes", "SP", "SP");
        Pessoa pessoa2 = new Pessoa(
               "Dani",
                16,
                1.69f,
                new Endereco(

                )



        System.out.println(pessoa1);
        System.out.println(pessoa2);

        pessoa1.comer("cenoura");
        pessoa2.comer("abóbora");
    }
}
