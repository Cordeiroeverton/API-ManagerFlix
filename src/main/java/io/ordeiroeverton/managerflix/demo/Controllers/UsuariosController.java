package io.ordeiroeverton.managerflix.demo.Controllers;

import java.util.List;
import java.util.Random;

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
import io.ordeiroeverton.managerflix.demo.Model.Usuarios;
import io.ordeiroeverton.managerflix.demo.Service.UsuariosService;

@RestController
@RequestMapping("usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @PostMapping("cadastrarUsuarios")
    public ResponseEntity<Usuarios> cadastrarUsuarios(@RequestBody Usuarios usuarios ){

        Usuarios usuariosCadastrar = usuariosService.cadastrarUsuarios(usuarios);

        return ResponseEntity.created(null).body(usuariosCadastrar);
    }
    
    @GetMapping("obterUsuarios/{id}")
    public ResponseEntity<Usuarios>obterUsuarios(@PathVariable  Long id){ 
        
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizarUsuarios/{id}")
    public ResponseEntity<Usuarios> atualizarUsuarios(@RequestBody Usuarios  usuarios, @PathVariable long id){

        Usuarios usuariosAtualizados = usuariosService.atualizarUsuarios(usuarios, id);

        return ResponseEntity.ok(usuariosAtualizados);
    }

    @GetMapping
    public ResponseEntity<List<Usuarios>> listarUsuarios(){

        List<Usuarios> listarUsuarios = usuariosService.listarUsuarios();

        return ResponseEntity.ok(listarUsuarios);
    }

    @DeleteMapping("deletarUsuarios/{id}")
    public ResponseEntity<Object> deletarUsuarios(@PathVariable long id){

        usuariosService.deletarUsuarios(id);

        return ResponseEntity.noContent().build();
    }

}
