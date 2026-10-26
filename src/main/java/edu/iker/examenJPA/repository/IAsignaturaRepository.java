package edu.iker.examenJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.iker.examenJPA.model.Asignatura;

public interface IAsignaturaRepository extends JpaRepository<Asignatura, Long> {
    Long countByCreditos(int creditos);

}
