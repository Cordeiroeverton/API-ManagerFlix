package io.ordeiroeverton.managerflix.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.ordeiroeverton.managerflix.demo.models.TituloAssistido;

public interface TitutoAssistidosRepository extends JpaRepository<TituloAssistido, Long> {
    //
}