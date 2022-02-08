package io.ordeiroeverton.managerflix.demo.mappers;

import org.mapstruct.Mapper;
import io.ordeiroeverton.managerflix.demo.dtos.request.PostTituloRequest;
import io.ordeiroeverton.managerflix.demo.models.Titulo;

@Mapper
public interface MapperTituloRequestToTitulo {
    public Titulo toModel(PostTituloRequest postTituloRequest);
}
