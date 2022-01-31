package io.ordeiroeverton.managerflix.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.ordeiroeverton.managerflix.demo.models.Usuario;
import io.ordeiroeverton.managerflix.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsuarios(Usuario usuarios) {

        Usuario usuarioCadastrado = usuarioRepository.save(usuarios);

        return usuarioCadastrado;
    }

    public Usuario obterUsuarios(Long id) {

        Usuario obterUsuario = usuarioRepository.findById(id).get();

        return obterUsuario;
    }

    public Usuario atualizarUsuarios(Usuario usuarios, long id) {

        Usuario usaurioAtualizado = this.obterUsuarios(id);

        usaurioAtualizado.setNome(usuarios.getNome());

        usuarioRepository.save(usuarios);

        return usuarios;
    }

    public List<Usuario> listarUsuarios() {

        List<Usuario> listarUsuarios = usuarioRepository.findAll();

        return listarUsuarios;
    }

    public void deletarUsuarios(long id) {
        usuarioRepository.deleteById(id);
        
    }
}
