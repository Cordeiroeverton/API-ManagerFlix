package io.ordeiroeverton.managerflix.demo.services;

import java.util.List;

import io.ordeiroeverton.managerflix.demo.exceptions.TamanhoNaoValidoException;
import org.springframework.stereotype.Service;
import io.ordeiroeverton.managerflix.demo.dtos.request.PostCategoriaRequest;
import io.ordeiroeverton.managerflix.demo.dtos.response.PostCategoriaResponse;
import io.ordeiroeverton.managerflix.demo.mappers.MapperCategoriaRequestCategoria;
import io.ordeiroeverton.managerflix.demo.mappers.MapperCategoriaToCategoriaResponse;
import io.ordeiroeverton.managerflix.demo.models.Categoria;
import io.ordeiroeverton.managerflix.demo.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;
    private final MapperCategoriaRequestCategoria mapperCategoriaRequestCategoria;
    private final MapperCategoriaToCategoriaResponse mapperCategoriaToCategoriaResponse;

    public PostCategoriaResponse cadastrarCategoria(PostCategoriaRequest postCategoriaRequest) {
        if (postCategoriaRequest.getNome().length() > 10) {
            throw new TamanhoNaoValidoException("Nome de categoria muito longo.");
        }
        Categoria categoria = mapperCategoriaRequestCategoria.toModel(postCategoriaRequest);
        
        categoriaRepository.save(categoria);

        return mapperCategoriaToCategoriaResponse.toResponse(categoria);
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