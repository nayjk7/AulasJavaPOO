package com.senai.exemplos.Concessionaria;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(
                "City",
                "Honda",
                "grena",
                2013,
                10000

        );
        Carro carro2 = new Carro(
                "BMW X7",
                "BMW",
                "cinza",
                2018,
                1199950

        );
        System.out.println(carro1);
        System.out.println(carro2);
        carro1.testeDriver();
        carro1.comprar("Nayara");
        carro2.testeDriver();
        carro2.comprar("Celia");
        carro1.valorTabelaFipe(2025);
        carro2.valorTabelaFipe(2025);

    }
}
