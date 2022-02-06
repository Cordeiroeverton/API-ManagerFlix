package io.ordeiroeverton.managerflix.demo.dtos.response;

import io.ordeiroeverton.managerflix.demo.dtos.request.PostUsuarioRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PostUsuarioResponse {
    private Long id;
    private PostUsuarioRequest nome;

}
