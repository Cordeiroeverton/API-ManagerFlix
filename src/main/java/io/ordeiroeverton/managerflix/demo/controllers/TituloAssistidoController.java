package io.ordeiroeverton.managerflix.demo.controllers;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.ordeiroeverton.managerflix.demo.models.TituloAssistido;
import io.ordeiroeverton.managerflix.demo.services.TituloAssistidosService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("assistidos")
public class TituloAssistidoController {

    private final TituloAssistidosService titulosAssistidosService;

    @GetMapping("obterTituloAssistido/{id}")
    public ResponseEntity<TituloAssistido> obterTituloAssistido(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizarTitulosAssistido/{id}")
    public ResponseEntity<TituloAssistido> atualizarTitulosAssistido(@RequestBody TituloAssistido titulosAssistidos,@PathVariable long id) {
        TituloAssistido assistidosAtualizado = titulosAssistidosService.atualizarTitulosAssistido(titulosAssistidos,id);

        return ResponseEntity.ok(assistidosAtualizado);
    }

    @GetMapping
    public ResponseEntity<List<TituloAssistido>> listarTitulosAssistidos() {
        List<TituloAssistido> listarTitulosAssistidos = titulosAssistidosService.listarTitulosAssistidos();

        return ResponseEntity.ok(listarTitulosAssistidos);
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Object> deletarTtitulsoAssistidos(@PathVariable long id) {
        titulosAssistidosService.deletarTtitulsoAssistidos(id);

        return ResponseEntity.noContent().build();
    }
}