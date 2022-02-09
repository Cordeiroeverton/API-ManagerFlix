package io.ordeiroeverton.managerflix.demo.dtos.response;

import lombok.Data;

@Data
public class PostTituloResponse {
    
    private Long id;
    private String nome;
    private String sinopse;
    private Integer temporadas;
    private Integer epsodios;
    private String duracao;
    private String mensagem;

}
