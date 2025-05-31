package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Rol;
import model.User;

public class UserDaoImpl implements UserDao {

	EntityManagerFactory fabrica;
	EntityManager em;
	
	public UserDaoImpl() {
		super();
		fabrica = Persistence.createEntityManagerFactory("Semana01-Alt");
		em = fabrica.createEntityManager();
	}
	
	@Override
	public User login(String email, String pass) {
		Query query = em.createNamedQuery("User.findByEmail");
		query.setParameter("email", email);
		query.setParameter("password", pass);
		
		List<User> lista = (List<User>) query.getResultList(); // getSingleResult();
		
		User user = new User();
		
		for(User e: lista) {
			user = e;
			System.out.println(e);
			System.out.println(e.getEmail());
			System.out.println(e.getRol().getRolName());
			System.out.println(e.getPeople().getName());
			System.out.println(e.getPeople().getLastname());
		}
		
		return user;
	}

	@Override
	public User find(Integer id) {
		return em.find(User.class, id);
	}
	
	

}
