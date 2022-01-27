package io.ordeiroeverton.managerflix.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.ordeiroeverton.managerflix.demo.models.Categorias;
import io.ordeiroeverton.managerflix.demo.services.CategoriaService;

@RestController
@RequestMapping("categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("cadastrar")
    public ResponseEntity<Categorias> cadastrarCategoria(@RequestBody Categorias categoria) {

        Categorias categorias = categoriaService.cadastrarCategoria(categoria);

        return ResponseEntity.created(null).body(categorias);
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Categorias> obterCategoria(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Categorias> atualizarCategoria(@RequestBody Categorias categorias, @PathVariable long id) {

        Categorias categoriasAtualizadas = categoriaService.atualizarCategoria(categorias, id);

        return ResponseEntity.ok(categoriasAtualizadas);
    }

    @GetMapping
    public ResponseEntity<List<Categorias>> listarCategoria() {

        List<Categorias> listarCategorias = categoriaService.listarCategoria();

        return ResponseEntity.ok(listarCategorias);
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Object> deletarCategoria(@PathVariable long id) {

        categoriaService.deletarCategoria(id);

        return ResponseEntity.noContent().build();
    }

}
