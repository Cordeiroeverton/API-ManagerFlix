package io.ordeiroeverton.managerflix.demo.services;

import java.util.List;
import org.springframework.stereotype.Service;

import io.ordeiroeverton.managerflix.demo.mocks.MockCategoria;
import io.ordeiroeverton.managerflix.demo.models.Categorias;

@Service
public class CategoriaService {

    public Categorias cadastrarCategoria(Categorias categoria) {

        return categoria;
    }

    public Categorias obterCategoria(Long id) {

        Categorias categorias = new Categorias();
        categorias.setId(id);

        return categorias;
    }

    public Categorias atualizarCategoria(Categorias categorias, long id) {
        categorias.setId(id);

        return categorias;
    }

    public List<Categorias> listarCategoria() {

        MockCategoria categoriaLista = new MockCategoria();

        return categoriaLista.listarCategorias();
    }

    public void deletarCategoria(long id) {
        //
    }
}
