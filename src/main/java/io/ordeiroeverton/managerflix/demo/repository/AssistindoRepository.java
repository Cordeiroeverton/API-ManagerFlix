
package io.ordeiroeverton.managerflix.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.ordeiroeverton.managerflix.demo.models.Assistindo;


@Repository
public interface AssistindoRepository extends JpaRepository<Assistindo, Long> {
//
}
