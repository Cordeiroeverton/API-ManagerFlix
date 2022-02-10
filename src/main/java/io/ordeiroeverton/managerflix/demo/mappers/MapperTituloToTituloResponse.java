package io.ordeiroeverton.managerflix.demo.mappers;

import org.mapstruct.Mapper;
import io.ordeiroeverton.managerflix.demo.dtos.response.PostTituloResponse;
import io.ordeiroeverton.managerflix.demo.models.Titulo;

@Mapper
public interface MapperTituloToTituloResponse {
    public PostTituloResponse toResponse(Titulo titulo);
}
