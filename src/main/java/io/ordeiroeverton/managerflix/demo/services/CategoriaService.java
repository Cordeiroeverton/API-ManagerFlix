
package io.ordeiroeverton.managerflix.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.ordeiroeverton.managerflix.demo.dtos.request.PostCategoriaRequest;
import io.ordeiroeverton.managerflix.demo.dtos.response.PostCategoriaResponse;
import io.ordeiroeverton.managerflix.demo.models.Categoria;
import io.ordeiroeverton.managerflix.demo.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public PostCategoriaResponse cadastrarCategoria(PostCategoriaRequest postCategoriaRequest) {

        Categoria categoria = new Categoria();

        categoria.setNome(postCategoriaRequest.getNome());

        Categoria categoriaCadastrada = categoriaRepository.save(categoria);

        PostCategoriaResponse postCategoriaResponse = new PostCategoriaResponse();
        postCategoriaResponse.setNome(categoriaCadastrada.getNome());
        postCategoriaResponse.setMensagem("Categoria cadastrada.");

        return postCategoriaResponse;
    }

    public Categoria obterCategoria(Long id) {
        return categoriaRepository.findById(id).get();
    }

    public Categoria atualizarCategoria(Categoria categorias, long id) {
        Categoria atualizarCategorias = this.obterCategoria(id);
        atualizarCategorias.setNome(categorias.getNome());

        return  categoriaRepository.save(categorias);
    }

    public List<Categoria> listarCategoria() {
        return categoriaRepository.findAll();
    }

    public void deletarCategoria(long id) {
        categoriaRepository.deleteById(id);
    }
}
