package io.ordeiroeverton.managerflix.demo.mocks;

import java.util.List;

import io.ordeiroeverton.managerflix.demo.models.Usuarios;

public class MockUsuarios {
    public List<Usuarios> listarUsuarios() {

        Usuarios usuarioUm = new Usuarios();

        usuarioUm.setId((long) 2);
        usuarioUm.setNome("Pedro");

        Usuarios usuarioDois = new Usuarios();

        usuarioDois.setId((long) 5);
        usuarioDois.setNome("Joana");

        Usuarios usuarioTres = new Usuarios();

        usuarioTres.setId((long) 32);
        usuarioTres.setNome("Beatriz");

        Usuarios usuarioQuatro = new Usuarios();

        usuarioQuatro.setId((long) 332);
        usuarioQuatro.setNome("Vanessa");

        return List.of(
                usuarioUm,
                usuarioDois,
                usuarioTres,
                usuarioQuatro);
    }
}
