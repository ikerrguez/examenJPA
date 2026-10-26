package edu.iker.examenJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.iker.examenJPA.repository.IAsignaturaRepository;
import edu.iker.examenJPA.repository.IEstudianteRepository;
import edu.iker.examenJPA.repository.IMatriculaRepository;

@SpringBootApplication
public class ExamenJpaApplication implements CommandLineRunner {

	@Autowired 
	private IAsignaturaRepository asignaturaRepository;

	@Autowired 
	private IEstudianteRepository estudianteRepository;

	@Autowired 
	private IMatriculaRepository matriculaRepository;

	

	public static void main(String[] args) {
		SpringApplication.run(ExamenJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("!PROBANDO COSAS...!");
		System.out.println("Número de asignaturas: " + asignaturaRepository.count());
		System.out.println("Número de estudiantes: " + estudianteRepository.count());
		System.out.println("Número de matrículas: " + matriculaRepository.count());

		System.out.println("CONTANDO ASIGNATURAS POR CRÉDITOS");
		System.out.println("Número de asignaturas con 1 crédito: " + asignaturaRepository.countByCreditos(1));
		System.out.println("Número de asignaturas con 2 créditos: " + asignaturaRepository.countByCreditos(2));
		System.out.println("Número de asignaturas con 3 créditos: " + asignaturaRepository.countByCreditos(3));
		System.out.println("Número de asignaturas con 4 créditos: " + asignaturaRepository.countByCreditos(4));
		System.out.println("Número de asignaturas con 5 créditos: " + asignaturaRepository.countByCreditos(5));
		System.out.println("Número de asignaturas con 6 créditos: " + asignaturaRepository.countByCreditos(6));
		System.out.println("Número de asignaturas con 7 créditos: " + asignaturaRepository.countByCreditos(7));
		System.out.println("Número de asignaturas con 8 créditos: " + asignaturaRepository.countByCreditos(8));
		System.out.println("Número de asignaturas con 9 créditos: " + asignaturaRepository.countByCreditos(9));
		System.out.println("Número de asignaturas con 10 créditos: " + asignaturaRepository.countByCreditos(10));
	




	}


	

}
