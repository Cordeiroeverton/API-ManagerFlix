package io.ordeiroeverton.managerflix.demo.Controllers;

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
import io.ordeiroeverton.managerflix.demo.Model.Titulos;
import io.ordeiroeverton.managerflix.demo.Service.TitulosService;


@RestController
@RequestMapping("titulos")
public class TitulosController {

    @Autowired
    private TitulosService titulosService;
    
    @PostMapping("cadastrar")
    public ResponseEntity<Titulos> cadastrar(@RequestBody Titulos titulos ){
        
        Titulos tituloCadastrar = titulosService.cadastrar(titulos);

        return ResponseEntity.created(null).body(tituloCadastrar);
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Titulos>obter(@PathVariable  Long id){ 

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Titulos> atualizar(@RequestBody Titulos titulos, @PathVariable long id){
        
        Titulos titutulosAtualizado = TitulosService.atualizar(titulos,id);

        return ResponseEntity.ok(titutulosAtualizado);
    }

    @GetMapping
    public ResponseEntity<List<Titulos>> listar(){

        List<Titulos> listarTitulos = TitulosService.listar();

        return ResponseEntity.ok(listarTitulos);
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Object> deletar(@PathVariable long id){

        TitulosService.deletar(id);

        return ResponseEntity.noContent().build();
    }

}
