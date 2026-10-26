package edu.iker.examenJPA.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.iker.examenJPA.model.Estudiante;

public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {

    Optional <Estudiante> findByDni(String dni);

    @Query(value = "SELECT e FROM Estudiante e INNER JOIN e.matriculas m WHERE m.asignatura.id = :asignaturaId", nativeQuery = true)
    List<Estudiante> findEstudiantesByAsignaturaId(@Param("asignaturaId") Long asignaturaId);

    



}
