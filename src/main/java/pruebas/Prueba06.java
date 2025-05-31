package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Estudiante;
import model.Rol;

public class Prueba06 {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Semana01-Alt");
		EntityManager em = fabrica.createEntityManager();
		
		Query query = em.createNamedQuery("Estudiante.findAll");
		
		List<Estudiante> lista = (List<Estudiante>) query.getResultList();
		
		for(Estudiante e: lista) {
			System.out.println(e);
			System.out.println(e.getIdEstudiante());
			System.out.println(e.getNombresApellidos());
		}

	}

}
