package com.senai.aula07_mvc.crud_usuario.model;

public class Operador extends Usuario{
        private String setor;

        public Operador(String nome, int id, String setor) {
            super(nome, id);
            this.setor = setor;
        }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return String.format("Id : %d, Nome: %s, Setor: %s",
                super.getId(), super.getNome(), setor
        );
    }
}


