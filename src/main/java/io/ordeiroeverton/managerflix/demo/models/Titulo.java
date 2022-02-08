package io.ordeiroeverton.managerflix.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String sinopse;
    private Integer temporadas;
    private Integer epsodios;
    private String duracao;

    public Titulo (Titulo titulo){
        this.id = titulo.getId();
        this.nome = titulo.getNome();
        this.sinopse = titulo.getSinopse();
        this.temporadas = titulo.getTemporadas();
        this.epsodios = titulo.getEpsodios();
        this.duracao = titulo.getDuracao();
    }
}