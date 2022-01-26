package io.ordeiroeverton.managerflix.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Titulos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String  nome;
    private String  sinopse;
    private Integer temporadas;
    private Integer  epsodios;
    private String  duracao;
 
   public Titulos(){

   }
    public Titulos(Long id, String nome, String sinopse, Integer temporadas, Integer epsodios, String duracao){
        this.id = id;
        this.nome = nome;
        this.sinopse = sinopse;
        this.temporadas = temporadas;
        this.epsodios = epsodios;
        this.duracao = duracao;
    

    }
    public long getId() {
        return id;
    }

    public void setId(long id2) {
        this.id = id2;
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



}
