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
import io.ordeiroeverton.managerflix.demo.Model.TitulosAssistidos;

@RestController
@RequestMapping("assistidos")
public class TitulosAssistidoController {
    

    @GetMapping("obterTtituloAssistido/{id}")
    public ResponseEntity<TitulosAssistidos>obterTtituloAssistido(@PathVariable  Long id){ 
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizarTitulosAssistido/{id}")
    public ResponseEntity<TitulosAssistidos> atualizarTitulosAssistido(@RequestBody TitulosAssistidos assistidos, @PathVariable long id){
        assistidos.setId(id);
       
        return ResponseEntity.ok(assistidos);
    }

    @GetMapping
    public ResponseEntity<List<TitulosAssistidos>> listarTitulosAssistidos(){

        TitulosAssistidos suits = new TitulosAssistidos();
        
        suits.setId((long) 349);
        suits.setNome("IT Crowd");
        suits.setSinopse("Descrição do Titulo");
        suits.setTemporadas(3);
        suits.setEpsodios(98);
        suits.setDuracao("43:00");
        suits.setStatus("Concluido");
        

        var supernatural = new TitulosAssistidos();

        supernatural.setId((long) 349);
        supernatural.setNome("Supernatural");
        supernatural.setSinopse("Descrição do Titulo");
        supernatural.setTemporadas(15);
        supernatural.setEpsodios(234);
        supernatural.setDuracao("43:00");
        supernatural.setStatus("Concluido");
       
      
        var breakingBad = new TitulosAssistidos();

        breakingBad.setId((long) 349);
        breakingBad.setNome("Supernatural");
        breakingBad.setSinopse("Descrição do Titulo");
        breakingBad.setTemporadas(15);
        breakingBad.setEpsodios(234);
        breakingBad.setDuracao("43:00");
        breakingBad.setStatus("Concluido");

        return ResponseEntity.ok(List.of(
            suits,
            supernatural,
            breakingBad
        )); 
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Object> deletarTtitulsoAssistidos(@PathVariable long id){
        return ResponseEntity.noContent().build();
    }


}
