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
import io.ordeiroeverton.managerflix.demo.Model.Usuarios;

@RestController
@RequestMapping("usuarios")
public class UsuariosController {

    @PostMapping("cadastrarUsuarios")
    public ResponseEntity<Usuarios> cadastrarUsuarios(@RequestBody Usuarios usuarios ){

            Random geraId = new Random();
            usuarios.setId(geraId.nextLong());
          
        return ResponseEntity.created(null).body(usuarios);
    }
    
    @GetMapping("obterUsuarios/{id}")
    public ResponseEntity<Usuarios>obterUsuarios(@PathVariable  Long id){ 
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizarUsuarios/{id}")
    public ResponseEntity<Usuarios> atualizarUsuarios(@RequestBody Usuarios  usuarios, @PathVariable long id){
        usuarios.setId(id);
       
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping
    public ResponseEntity<List<Usuarios>> listarUsuarios(){

        Usuarios usuarioUm = new Usuarios();
        
        usuarioUm.setId((long) 2);
        usuarioUm.setNome("Pedro");
        
        Usuarios usuarioDois = new Usuarios();
        
        usuarioDois.setId((long) 5);
        usuarioDois.setNome("Joana");

        Usuarios usuarioTres = new Usuarios();
        
        usuarioTres.setId((long) 32);
        usuarioTres.setNome("Beatriz");

        Usuarios usuarioQuatro = new Usuarios();
        
        usuarioQuatro.setId((long) 332);
        usuarioQuatro.setNome("Vanessa");
 
        return ResponseEntity.ok(List.of(
            usuarioUm,
            usuarioDois,
            usuarioTres,
            usuarioQuatro
        )); 
    }

    @DeleteMapping("eletarUsuarios/{id}")
    public ResponseEntity<Object> deletarUsuarios(@PathVariable long id){
        return ResponseEntity.noContent().build();
    }

}
