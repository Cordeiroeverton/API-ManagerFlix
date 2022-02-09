package io.ordeiroeverton.managerflix.demo.dtos.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PostCategoriaRequest {

    @NotBlank
    @Size(min = 3, message = "Descrição não pode ter menos de 3 caracteres.")
    private String nome;
}