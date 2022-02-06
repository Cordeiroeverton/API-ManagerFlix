package io.ordeiroeverton.managerflix.demo.mappers;

import org.mapstruct.Mapper;
import io.ordeiroeverton.managerflix.demo.dtos.request.PostCategoriaRequest;
import io.ordeiroeverton.managerflix.demo.models.Categoria;

@Mapper
public interface MapperCategoriaRequestCategoria {
    public Categoria toModel(PostCategoriaRequest postCategoriaRequest);
}
