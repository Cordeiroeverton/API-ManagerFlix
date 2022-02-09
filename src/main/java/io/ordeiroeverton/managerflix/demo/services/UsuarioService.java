package io.ordeiroeverton.managerflix.demo.services;

import java.util.List;

import io.ordeiroeverton.managerflix.demo.exceptions.TamanhoNaoValidoException;
import org.springframework.stereotype.Service;
import io.ordeiroeverton.managerflix.demo.dtos.request.PostUsuarioRequest;
import io.ordeiroeverton.managerflix.demo.dtos.response.PostUsuarioResponse;
import io.ordeiroeverton.managerflix.demo.mappers.MapperUsuarioRequestToUsuario;
import io.ordeiroeverton.managerflix.demo.mappers.MapperUsuarioToUsuarioResponse;
import io.ordeiroeverton.managerflix.demo.models.Usuario;
import io.ordeiroeverton.managerflix.demo.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final MapperUsuarioRequestToUsuario mapperUsuarioRequestToUsuario;
    private final MapperUsuarioToUsuarioResponse mapperUsuarioToUsuarioResponse;

    public PostUsuarioResponse cadastrarUsuarios(PostUsuarioRequest postUsuarioRequest) {
        if (postUsuarioRequest.getNome().length() < 20) {
            throw new TamanhoNaoValidoException("Nome de Usuario muito longo.");
        }

        Usuario usuario =  mapperUsuarioRequestToUsuario.toModel(postUsuarioRequest);
         usuarioRepository.save(usuario);

        return mapperUsuarioToUsuarioResponse.toResponse(usuario);
    }

    public Usuario obterUsuarios(Long id) {
        return usuarioRepository.findById(id).get();
    }

    public Usuario atualizarUsuarios(Usuario usuarios, long id) {
        Usuario usuarioAtualizado = this.obterUsuarios(id);
        usuarioAtualizado.setNome(usuarios.getNome());

        return  usuarioRepository.save(usuarios);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public void deletarUsuarios(long id) {
        usuarioRepository.deleteById(id);
    }
}