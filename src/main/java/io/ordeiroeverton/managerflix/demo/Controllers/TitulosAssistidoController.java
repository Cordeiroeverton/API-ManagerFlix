package io.ordeiroeverton.managerflix.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.ordeiroeverton.managerflix.demo.models.TitulosAssistidos;
import io.ordeiroeverton.managerflix.demo.services.TitulosAssistidosService;

@RestController
@RequestMapping("assistidos")
public class TitulosAssistidoController {

    @Autowired
    private TitulosAssistidosService titulosAssistidosService;

    @GetMapping("obterTtituloAssistido/{id}")
    public ResponseEntity<TitulosAssistidos> obterTtituloAssistido(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizarTitulosAssistido/{id}")
    public ResponseEntity<TitulosAssistidos> atualizarTitulosAssistido(@RequestBody TitulosAssistidos titulosAssistidos,
            @PathVariable long id) {

        TitulosAssistidos assistidosAtualizado = titulosAssistidosService.atualizarTitulosAssistido(titulosAssistidos,
                id);

        return ResponseEntity.ok(assistidosAtualizado);
    }

    @GetMapping
    public ResponseEntity<List<TitulosAssistidos>> listarTitulosAssistidos() {

        List<TitulosAssistidos> listarAssistidos = titulosAssistidosService.listarTitulosAssistidos();

        return ResponseEntity.ok(listarAssistidos);
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Object> deletarTtitulsoAssistidos(@PathVariable long id) {

        titulosAssistidosService.deletarTtitulsoAssistidos(id);

        return ResponseEntity.noContent().build();
    }

}
