package io.ordeiroeverton.managerflix.demo.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PostCategoriaResponse {
    
    private long id;
    private String nome;
    private String mensagem;
}
