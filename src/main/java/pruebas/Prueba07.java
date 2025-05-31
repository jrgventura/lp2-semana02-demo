package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Estudiante;

public class Prueba07 {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Semana01-Alt");
		EntityManager em = fabrica.createEntityManager();
		
		Query query = em.createNamedQuery("Estudiante.findByIdEst");
		query.setParameter("idEstudiante", 2);
		
		List<Estudiante> lista = (List<Estudiante>) query.getResultList();
		
		for(Estudiante e: lista) {
			System.out.println(e);
			System.out.println(e.getIdEstudiante());
			System.out.println(e.getNombresApellidos());
		}

	}

}
