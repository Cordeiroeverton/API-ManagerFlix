package io.ordeiroeverton.managerflix.demo.controllers;

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
import io.ordeiroeverton.managerflix.demo.dtos.request.PostUsuarioRequest;
import io.ordeiroeverton.managerflix.demo.dtos.response.PostUsuarioResponse;
import io.ordeiroeverton.managerflix.demo.models.Usuario;
import io.ordeiroeverton.managerflix.demo.services.UsuarioService;

import javax.validation.Valid;

@RestController
@RequestMapping("usuarios")
public class UsuariosController {

    @Autowired
    private UsuarioService usuariosService;

    @PostMapping("cadastrarUsuarios")
    public ResponseEntity<PostUsuarioResponse> cadastrarUsuarios(@RequestBody @Valid PostUsuarioRequest postUsuarioRequest) {

        PostUsuarioResponse postUsuarioResponse = usuariosService.cadastrarUsuarios(postUsuarioRequest);

        return ResponseEntity.created(null).body(postUsuarioResponse);
    }

    @GetMapping("obterUsuarios/{id}")
    public ResponseEntity<Usuario> obterUsuarios(@PathVariable Long id) {

        Usuario obterUsuario = usuariosService.obterUsuarios(id);

        return ResponseEntity.ok(obterUsuario);
    }

    @PatchMapping("atualizarUsuarios/{id}")
    public ResponseEntity<Usuario> atualizarUsuarios(@RequestBody Usuario usuarios, @PathVariable long id) {

        Usuario usuariosAtualizados = usuariosService.atualizarUsuarios(usuarios, id);

        return ResponseEntity.ok(usuariosAtualizados);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios() {

        List<Usuario> listarUsuarios = usuariosService.listarUsuarios();

        return ResponseEntity.ok(listarUsuarios);
    }

    @DeleteMapping("deletarUsuarios/{id}")
    public ResponseEntity<Object> deletarUsuarios(@PathVariable long id) {

        usuariosService.deletarUsuarios(id);

        return ResponseEntity.noContent().build();
    }

    
}
