package io.ordeiroeverton.managerflix.demo.dtos.request;

import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PostUsuarioRequest {

    @NotBlank(message = "Campo nome necessário ser preenchido.")
    private String nome;
}