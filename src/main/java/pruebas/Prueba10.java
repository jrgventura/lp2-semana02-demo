package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Estudiante2;

public class Prueba10 {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Semana01-Alt");
		EntityManager em = fabrica.createEntityManager();
		
		Query query = em.createQuery("SELECT e FROM Estudiante2 e WHERE e.idEstudiante =:idEstudiante");
		query.setParameter("idEstudiante", 2);
		
		List<Estudiante2> lista = (List<Estudiante2>) query.getResultList();
		
		for(Estudiante2 e: lista) {
			System.out.println(e);
			System.out.println(e.getIdEstudiante());
			System.out.println(e.getNombresApellidos());
			System.out.println(e.getTipodocumento().getDocumento());
		}

	}
	
}
