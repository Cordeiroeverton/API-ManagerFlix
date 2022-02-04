package io.ordeiroeverton.managerflix.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.ordeiroeverton.managerflix.demo.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    //
}
