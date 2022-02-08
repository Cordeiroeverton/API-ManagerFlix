package io.ordeiroeverton.managerflix.demo.controllers;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.ordeiroeverton.managerflix.demo.dtos.request.PostCategoriaRequest;
import io.ordeiroeverton.managerflix.demo.dtos.response.PostCategoriaResponse;
import io.ordeiroeverton.managerflix.demo.models.Categoria;
import io.ordeiroeverton.managerflix.demo.services.CategoriaService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;

    @PostMapping("/cadastrar")
    public ResponseEntity<PostCategoriaResponse> cadastrarCategoria(@RequestBody @Validated PostCategoriaRequest postCategoriaRequest) {
        PostCategoriaResponse postCategoriaResponse = categoriaService.cadastrarCategoria(postCategoriaRequest);

       return ResponseEntity.created(null).body(postCategoriaResponse);
    }

    @GetMapping("/obter/{id}")
    public ResponseEntity<Categoria> obterCategoria(@PathVariable Long id) {
        Categoria categoriaObtida = categoriaService.obterCategoria(id);

        return ResponseEntity.ok(categoriaObtida);
    }

    @PatchMapping("/atualizar/{id}")
    public ResponseEntity<Categoria> atualizarCategoria(@RequestBody Categoria categorias, @PathVariable long id) {
        Categoria categoriasAtualizadas = categoriaService.atualizarCategoria(categorias, id);

        return ResponseEntity.ok(categoriasAtualizadas);
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listarCategoria() {
        List<Categoria> listarCategorias = categoriaService.listarCategoria();

        return ResponseEntity.ok(listarCategorias);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Object> deletarCategoria(@PathVariable long id) {
        categoriaService.deletarCategoria(id);

        return ResponseEntity.noContent().build();
    }
}