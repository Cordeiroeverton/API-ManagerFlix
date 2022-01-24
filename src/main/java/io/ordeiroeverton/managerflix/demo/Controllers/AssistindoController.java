package io.ordeiroeverton.managerflix.demo.Controllers;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.ordeiroeverton.managerflix.demo.Model.Assistindo;

@RestController
@RequestMapping("assistindo")
public class AssistindoController { 

    @GetMapping("obter/{id}")
    public ResponseEntity<Assistindo>obter(@PathVariable  Long id){ 
       
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("mudarStatus/{id}")
    public ResponseEntity<Assistindo> mudarStatus(@RequestBody Assistindo assistindo, @PathVariable long id){
       
        assistindo.setId(id);      
        return ResponseEntity.ok(assistindo);
    }

    @GetMapping
    public ResponseEntity<List<Assistindo>> listarAssistindo(){

        Assistindo JessicaJones = new Assistindo();
        
        JessicaJones.setId((long) 34);
        JessicaJones.setNome("Jessica Jones");
        JessicaJones.setSinopse("Descrição do Titulo");
        JessicaJones.setTemporadas(3);
        JessicaJones.setEpsodios(98);
        JessicaJones.setDuracao("43:00");
        JessicaJones.setStatus("Concluido");

        Assistindo Vikings = new Assistindo();

        Vikings.setId(23);
        Vikings.setNome("Vikings");
        Vikings.setSinopse("Descrição do Titulo");
        Vikings.setTemporadas(7);
        Vikings.setEpsodios(100);
        Vikings.setDuracao("52:00");
        Vikings.setStatus("Em andamento");

        var StrangerThings = new Assistindo();

        StrangerThings.setId(45);
        StrangerThings.setNome("Stranger Things");
        StrangerThings.setSinopse("Descrição do Titulo");
        StrangerThings.setTemporadas(4);
        StrangerThings.setEpsodios(50);
        StrangerThings.setDuracao("45:00");
        StrangerThings.setStatus("Em andamento");

        var CobraKai = new Assistindo();

        CobraKai.setId(4);
        CobraKai.setNome("Cobra Kai");
        CobraKai.setSinopse("Descrição do Titulo");
        CobraKai.setTemporadas(4);
        CobraKai.setEpsodios(40);
        CobraKai.setDuracao("45:00");
        CobraKai.setStatus("Concluido");

        return ResponseEntity.ok(List.of(
            JessicaJones,
            Vikings,
            StrangerThings,
            CobraKai
        )); 
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Object> deletar(@PathVariable long id){
        return ResponseEntity.noContent().build();
    }


}
