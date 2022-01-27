package io.ordeiroeverton.managerflix.demo.controllers;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.ordeiroeverton.managerflix.demo.models.Assistindo;
import io.ordeiroeverton.managerflix.demo.services.AssistindoService;

@RestController
@RequestMapping("assistindo")
public class AssistindoController {

    @Autowired
    private AssistindoService assistindoService;

    @GetMapping("obter/{id}")
    public ResponseEntity<Assistindo> obter(@PathVariable Long id) {

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("mudarStatus/{id}")
    public ResponseEntity<Assistindo> mudarStatus(@RequestBody Assistindo assistindo, @PathVariable long id) {
        Assistindo assistindoStatus = assistindoService.mudarStatus(assistindo, id);

        return ResponseEntity.ok(assistindoStatus);
    }

    @GetMapping
    public ResponseEntity<List<Assistindo>> listarAssistindo() {

        List<Assistindo> listarAssistindo = assistindoService.listarAssistindo();

        return ResponseEntity.ok(listarAssistindo);
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Object> deletar(@PathVariable long id) {

        assistindoService.deletar(id);

        return ResponseEntity.noContent().build();
    }
}
