package io.ordeiroeverton.managerflix.demo.dtos.request;

import javax.validation.constraints.*;
import lombok.Data;

@Data
public class PostTituloRequest {

    @NotBlank
    @Size(min = 10, message = "Campo nome deve ser preenchido.")
    private String nome;

    @NotBlank
    @Size(min = 2,message = "Campo sinopse deve ser preenchido.")
    private String sinopse;

    @NotBlank
    @Size(min = 1, message = "Campo temporadas deve ser preenchido")
    private Integer temporadas;

    @NotBlank
    @Size(min = 1, message = "Campo epsodios deve ser preenchido")
    private Integer epsodios;

    @NotBlank
    @Size(min = 1,message = "Campo duração deve ser preenchido.")
    private String duracao;

}