package io.ordeiroeverton.managerflix.demo.mappers;

import org.mapstruct.Mapper;
import io.ordeiroeverton.managerflix.demo.dtos.response.PostUsuarioResponse;
import io.ordeiroeverton.managerflix.demo.models.Usuario;

@Mapper
public interface MapperUsuarioToUsuarioResponse {
    public PostUsuarioResponse toResponse(Usuario usuario);
}
