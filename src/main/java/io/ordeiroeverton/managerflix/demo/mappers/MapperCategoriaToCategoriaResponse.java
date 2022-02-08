package io.ordeiroeverton.managerflix.demo.mappers;

import org.mapstruct.Mapper;
import io.ordeiroeverton.managerflix.demo.dtos.response.PostCategoriaResponse;
import io.ordeiroeverton.managerflix.demo.models.Categoria;

@Mapper
public interface MapperCategoriaToCategoriaResponse {
    public PostCategoriaResponse toResponse(Categoria categoria);
}
