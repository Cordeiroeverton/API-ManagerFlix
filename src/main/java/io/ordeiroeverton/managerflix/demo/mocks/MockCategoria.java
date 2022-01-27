package io.ordeiroeverton.managerflix.demo.mocks;

import java.util.List;

import io.ordeiroeverton.managerflix.demo.models.Categorias;

public class MockCategoria {

    public List<Categorias> listarCategorias() {

        Categorias Comedia = new Categorias();

        Comedia.setId(34);
        Comedia.setNome("Comédia");

        var Aventura = new Categorias();

        Aventura.setId(23);
        Aventura.setNome("Aventura");

        var Acao = new Categorias();

        Acao.setId(67);
        Acao.setNome("Ação");

        return List.of(
                Comedia,
                Aventura,
                Acao);

    }
}