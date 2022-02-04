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

import io.ordeiroeverton.managerflix.demo.models.Titulo;
import io.ordeiroeverton.managerflix.demo.services.TituloService;

@RestController
@RequestMapping("titulos")
public class TituloController {

    @Autowired
    private TituloService titulosService;

    @PostMapping("cadastrar")
    public ResponseEntity<Titulo> cadastrar(@RequestBody Titulo titulos) {

        Titulo tituloCadastrar = titulosService.cadastrar(titulos);

        return ResponseEntity.created(null).body(tituloCadastrar);
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Titulo> obter(@PathVariable Long id) {

        Titulo titulosObtidos = titulosService.obter(id);

        return ResponseEntity.ok(titulosObtidos);
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Titulo> atualizar(@RequestBody Titulo titulos, @PathVariable long id) {

        Titulo titutulosAtualizado = titulosService.atualizar(titulos, id);

        return ResponseEntity.ok(titutulosAtualizado);
    }

    @GetMapping
    public ResponseEntity<List<Titulo>> listar() {

        List<Titulo> listarTitulos = titulosService.listar();

        return ResponseEntity.ok(listarTitulos);
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Object> deletar(@PathVariable long id) {

        titulosService.deletar(id);

        return ResponseEntity.noContent().build();
    }

}
