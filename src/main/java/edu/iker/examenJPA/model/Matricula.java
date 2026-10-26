package edu.iker.examenJPA.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import edu.iker.examenJPA.enums.Convocatoria;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity 
@Table (name= "matriculas")

public class Matricula {

    @Id 
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Long id;

    @Column (nullable= false)
    private LocalDate fechaMatriculacion;

    @Column (nullable= true, unique=false)
    private Double calificacion;

    @Enumerated (EnumType.STRING)
    private Convocatoria convocatoria;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "id_asignatura")
    private Asignatura asignatura;

    public Matricula() {
    }

    public Matricula(LocalDate fechaMatriculacion, Double calificacion, Convocatoria convocatoria,
            Estudiante estudiante, Asignatura asignatura) {
        this.fechaMatriculacion = fechaMatriculacion;
        this.calificacion = calificacion;
        this.convocatoria = convocatoria;
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(Convocatoria convocatoria) {
        this.convocatoria = convocatoria;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    
    
}
