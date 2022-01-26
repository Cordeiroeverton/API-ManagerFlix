package io.ordeiroeverton.managerflix.demo.services;

import java.util.List;
import org.springframework.stereotype.Service;

import io.ordeiroeverton.managerflix.demo.mocks.MockUsuarios;
import io.ordeiroeverton.managerflix.demo.models.Usuarios;

@Service
public class UsuariosService {

    public Usuarios cadastrarUsuarios(Usuarios usuarios) {

        return usuarios;
    }

    public Usuarios obterUsuarios(Long id) {

        Usuarios usuarios = new Usuarios();
        usuarios.setId(id);

        return usuarios;
    }

    public Usuarios atualizarUsuarios(Usuarios usuarios, long id) {
        usuarios.setId(id);

        return usuarios;
    }

    public List<Usuarios> listarUsuarios() {

        MockUsuarios listaUsuarios = new MockUsuarios();

        return listaUsuarios.listarUsuarios();
    }

    public void deletarUsuarios(long id) {
        //
    }
}
