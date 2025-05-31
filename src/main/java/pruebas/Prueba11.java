package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.User;

public class Prueba11 {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Semana01-Alt");
		EntityManager em = fabrica.createEntityManager();
		
		Query query = em.createNamedQuery("User.findByEmail");
		query.setParameter("email", "emai01@cibertec.edu.pe");
		query.setParameter("password", "123456");
		
		@SuppressWarnings("unchecked")
		List<User> lista = (List<User>) query.getResultList();
		
		for(User e: lista) {
			System.out.println(e);
			System.out.println(e.getEmail());
			System.out.println(e.getRol().getRolName());
			System.out.println(e.getPeople().getName());
			System.out.println(e.getPeople().getLastname());
		}

	}

}
