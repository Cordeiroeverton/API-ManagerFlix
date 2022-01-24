package io.ordeiroeverton.managerflix.demo.Model; 

public class Categoria {

    private long id;
    private String nome;

    public Categoria(){

    }

    public long getId() {
        return id;
    }

    public  Long setId(long id) {
        return this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}