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
import io.ordeiroeverton.managerflix.demo.Model.Categoria;

@RestController
@RequestMapping("categoria")
public class CategoriaController {
    
    @PostMapping("cadastrar")
    public ResponseEntity<Categoria> cadastrarCategoria(@RequestBody Categoria categoria ){

            Random geraId = new Random();
            categoria.setId(geraId.nextLong());
          
        return ResponseEntity.created(null).body(categoria);
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Categoria>obterCategoria(@PathVariable  Long id){ 
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Categoria> atualizarCategoria(@RequestBody Categoria categoria, @PathVariable long id){
        categoria.setId(id);
       
        return ResponseEntity.ok(categoria);
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listarCategoria(){

        Categoria Comedia = new Categoria();
        
        Comedia.setId(34);
        Comedia.setNome("Comédia");

        var Aventura = new Categoria();

        Aventura.setId(23);
        Aventura.setNome("Aventura");
      
        var Acao = new Categoria();

        Acao.setId(67);
        Acao.setNome("Ação");

        return ResponseEntity.ok(List.of(
            Comedia,
            Aventura,
            Acao
        )); 
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Object> deletarCategoria(@PathVariable long id){
        return ResponseEntity.noContent().build();
    }

}
