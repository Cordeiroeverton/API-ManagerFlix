
package io.ordeiroeverton.managerflix.demo.mappers;

import org.mapstruct.Mapper;
import io.ordeiroeverton.managerflix.demo.dtos.request.PostUsuarioRequest;
import io.ordeiroeverton.managerflix.demo.models.Usuario;

@Mapper
public interface MapperUsuarioRequestToUsuario {
        public Usuario toModel(PostUsuarioRequest postUsuarioRequest);
}
