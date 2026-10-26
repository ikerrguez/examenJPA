package edu.iker.examenJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.iker.examenJPA.model.Matricula;

public interface IMatriculaRepository extends JpaRepository<Matricula, Long> {

    List<Matricula> findByCalificacionGreaterThanEqual(Double calificacion);

}
