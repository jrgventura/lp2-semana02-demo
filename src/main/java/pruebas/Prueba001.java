package pruebas;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Tipodocumento;

public class Prueba001 {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Semana01-Alt");
		EntityManager em = fabrica.createEntityManager();
		
		Query query = em.createNamedQuery("Tipodocumento.findAll");
		
		List<Tipodocumento> lista = (List<Tipodocumento>) query.getResultList();
		
		for(Tipodocumento r: lista) {
			System.out.println(r);
			System.out.println(r.getIdTipo());
			System.out.println(r.getDocumento());
		}

	}

}
