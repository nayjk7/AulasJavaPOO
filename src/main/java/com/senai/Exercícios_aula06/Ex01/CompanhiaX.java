package com.senai.Exercícios_aula06.Ex01;

public class CompanhiaX implements CheckIn{

    @Override
    public void validarDocumentos(String documento) {
        if (documento != null && documento.length() >= 5) {
            System.out.println("Documento válido.");
        } else {
            System.out.println("Documento inválido.");
        }
    }

    @Override
    public void emitirCartaoEmbarque(String nomePassageiro) {
        if (nomePassageiro != null && !nomePassageiro.isEmpty()) {
            System.out.println("Cartão de embarque emitido para: " + nomePassageiro);
        } else {
            System.out.println("Nome inválido.");
        }
    }
}
