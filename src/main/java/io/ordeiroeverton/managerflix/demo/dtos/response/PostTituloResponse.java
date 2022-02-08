package io.ordeiroeverton.managerflix.demo.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PostTituloResponse {
    
    private Long tituloCadastrado;
    private String mensagem;

}
