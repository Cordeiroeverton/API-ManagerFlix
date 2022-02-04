package io.ordeiroeverton.managerflix.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.ordeiroeverton.managerflix.demo.models.Categoria;
import io.ordeiroeverton.managerflix.demo.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria cadastrarCategoria(Categoria categoria) {

        Categoria cadastrarCategoria = categoriaRepository.save(categoria);

        return cadastrarCategoria;
    }

    public Categoria obterCategoria(Long id) {

        Categoria obterCategorias = categoriaRepository.findById(id).get();

        return obterCategorias;
    }

    public Categoria atualizarCategoria(Categoria categorias, long id) {
        Categoria  atualizarCategorias = this.obterCategoria(id);

        atualizarCategorias.setNome(categorias.getNome());

        categoriaRepository.save(categorias);

        return categorias;
    }

    public List<Categoria> listarCategoria() {

        List<Categoria> listarCategoria = categoriaRepository.findAll();

        return listarCategoria;
    }

    public void deletarCategoria(long id) {    
        categoriaRepository.deleteById(id);

    }
}
