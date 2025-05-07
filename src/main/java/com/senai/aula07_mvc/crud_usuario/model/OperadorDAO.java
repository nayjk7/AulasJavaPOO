package com.senai.aula07_mvc.crud_usuario.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.getType;

public class OperadorDAO {
    private List<Operador> operadores;
    private final String FILE_PATH = "operadores.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();


    private List<Operador> carregar(){
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type listType = new TypeToken<ArrayList<Operador>>() {}.getType();
            return gson.fromJson(reader, listType);
        }catch (IOException e){
            return new ArrayList<>();
        }
    }
    public OperadorDAO(){
        operadores = carregar();
    }
    public void salvar(Operador operador){

    }
    public List<Operador> listar(){
        return operadores;
    }
    public void atualizar(Operador operador){
        operadores.forEach(o->{
            if (o.getId()==operador.getId()){
                o.setNome(operador.getNome());
                o.setSetor(operador.getSetor());
            }
        } );
        salvarJson();
    }

    private void salvarJson() {
    }

    public void deletar(int id){
        operadores.remove(id);
        salvarJson();

    }
}
