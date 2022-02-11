package io.ordeiroeverton.managerflix.demo.dtos.request;

import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PostCategoriaRequest {

    @NotBlank(message= "Campo nome não pode ser vazio.")
    private String nome;
}