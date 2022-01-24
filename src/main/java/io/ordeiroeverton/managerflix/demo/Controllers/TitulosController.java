package io.ordeiroeverton.managerflix.demo.Controllers;

import java.util.List;
import java.util.Random;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.ordeiroeverton.managerflix.demo.Model.Titulos;

@RestController
@RequestMapping("titulos")
public class TitulosController {
    
    @PostMapping("cadastrar")
    public ResponseEntity<Titulos> cadastrar(@RequestBody Titulos titulos ){

            Random geraId = new Random();
            titulos.setId(geraId.nextInt());
          
        return ResponseEntity.created(null).body(titulos);
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Titulos>obter(@PathVariable  Long id){ 
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Titulos> atualizar(@RequestBody Titulos titulos, @PathVariable long id){
        titulos.setId(id);
       
        return ResponseEntity.ok(titulos);
    }

    @GetMapping
    public ResponseEntity<List<Titulos>> listar(){

        Titulos JessicaJones = new Titulos();
        
        JessicaJones.setId(34);
        JessicaJones.setNome("Jessica Jones");
        JessicaJones.setSinopse("Descrição do Titulo");
        JessicaJones.setTemporadas(3);
        JessicaJones.setEpsodios(98);
        JessicaJones.setDuracao("43:00");

        Titulos Vikings = new Titulos();

        Vikings.setId(23);
        Vikings.setNome("Vikings");
        Vikings.setSinopse("Descrição do Titulo");
        Vikings.setTemporadas(7);
        Vikings.setEpsodios(100);
        Vikings.setDuracao("52:00");

        var StrangerThings = new Titulos();

        StrangerThings.setId(45);
        StrangerThings.setNome("Stranger Things");
        StrangerThings.setSinopse("Descrição do Titulo");
        StrangerThings.setTemporadas(4);
        StrangerThings.setEpsodios(50);
        StrangerThings.setDuracao("45:00");

        return ResponseEntity.ok(List.of(
            JessicaJones,
            Vikings,
            StrangerThings
        )); 
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Object> deletar(@PathVariable long id){
        return ResponseEntity.noContent().build();
    }

}
