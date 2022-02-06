package io.ordeiroeverton.managerflix.demo.dtos.request;

import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PostCategoriaRequest {

    @NotBlank(message = "O campo nome deve ser preenchido.")
    private String nome;
}