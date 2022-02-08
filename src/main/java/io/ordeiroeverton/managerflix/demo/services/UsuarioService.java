package io.ordeiroeverton.managerflix.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.ordeiroeverton.managerflix.demo.dtos.request.PostUsuarioRequest;
import io.ordeiroeverton.managerflix.demo.dtos.response.PostUsuarioResponse;
import io.ordeiroeverton.managerflix.demo.models.Usuario;
import io.ordeiroeverton.managerflix.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public PostUsuarioResponse cadastrarUsuarios(PostUsuarioRequest postUsuarioRequest) {

        Usuario usuarios = new Usuario();
        usuarios.setNome(postUsuarioRequest.getNome());

        Usuario usuarioCriado = usuarioRepository.save(usuarios);

        PostUsuarioResponse postUsuarioResponse = new PostUsuarioResponse();
        postUsuarioResponse.setNome(usuarioCriado.getNome());
        postUsuarioResponse.setMensagem("Usuario Cadastrado");

        return postUsuarioResponse;
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
