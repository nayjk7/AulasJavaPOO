package com.senai.Aula05_polimorfismo.exemplos.Calculadora;

public class Calculadora {
    int somar1(int x, int y) {
        System.out.println("int, int");
        return x + y;

    }

    double somar2(int x, int y, int z) {
        System.out.println("int, int, int");
        return x + y + z;
    }

    double somar3(double x, double y) {
        System.out.println("double, double");
        return x + y;

    }

    double somar4(int x, double y) {
        System.out.println("int, double");
        return x + y;
    }

    double somar5(double x, int y) {
        System.out.println("double, int");
        return x + y;
    }
}

