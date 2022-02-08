package io.ordeiroeverton.managerflix.demo.dtos.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PostTituloRequest {

    @NotBlank(message = "O campo nome deve ser preenchido.")
    private String nome;

    @NotBlank(message = "O campo sinopse deve ser preenchido.")
    private String sinopse;

    @NotNull(message = "Campo temporadas deve ser preenchido.")
    @Min(0)
    @Max(40)
    private Integer temporadas;

    @NotNull(message = "Campo epsodios deve ser preenchido")
    @Min(0)
    @Max(50)
    private Integer epsodios;

    @NotBlank(message = "Campo duração deve ser preenchido.")
    private String duracao;

}