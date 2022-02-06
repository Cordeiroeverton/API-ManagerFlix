package io.ordeiroeverton.managerflix.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TituloAssistido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sinopse;
    private Integer temporadas;
    private Integer epsodios;
    private String duracao;
    private String status;

    public TituloAssistido(TituloAssistido tituloAssistido) {
        this.id = tituloAssistido.getId();
        this.nome = tituloAssistido.getNome();
        this.sinopse = tituloAssistido.getSinopse();
        this.temporadas = tituloAssistido.getTemporadas();
        this.epsodios = tituloAssistido.getEpsodios();
        this.duracao = tituloAssistido.getDuracao();
        this.status = tituloAssistido.getStatus();
    }
}