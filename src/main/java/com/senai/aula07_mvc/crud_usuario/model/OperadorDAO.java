package com.senai.aula07_mvc.crud_usuario.model;

import java.util.List;

public class OperadorDAO {
    private List<Operador> operadores;
    private final String FILE_PATH = "operadores.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void salvar(Operador operador){

    }
    public List<Operador> listar(){
        List<Operador> lista;
        return lista;
    }
    public void atualizar(Operador operador){
    }
    public void deletar(int id){

    }
}
