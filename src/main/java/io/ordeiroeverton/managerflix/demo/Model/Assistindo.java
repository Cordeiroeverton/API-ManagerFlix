package io.ordeiroeverton.managerflix.demo.Model;

public class Assistindo {
    
    private  Long id;
    private String  nome;
    private String  sinopse;
    private Integer temporadas;
    private Integer  epsodios;
    private String  duracao;
    private  String Status;


    public Assistindo(){

    }


    public Long getId() {
        return id;
    }


    public void setId(long l) {
        this.id = l;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSinopse() {
        return sinopse;
    }


    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }


    public Integer getTemporadas() {
        return temporadas;
    }


    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }


    public Integer getEpsodios() {
        return epsodios;
    }


    public void setEpsodios(Integer epsodios) {
        this.epsodios = epsodios;
    }


    public String getDuracao() {
        return duracao;
    }


    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }


    public String getStatus() {
        return Status;
    }


    public void setStatus(String status) {
        Status = status;
    }



    
}
