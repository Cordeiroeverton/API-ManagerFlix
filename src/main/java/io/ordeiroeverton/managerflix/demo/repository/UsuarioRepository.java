package io.ordeiroeverton.managerflix.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.ordeiroeverton.managerflix.demo.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
