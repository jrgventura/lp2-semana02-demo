package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Carreras;

public class CarrerasDaoImpl implements CarreraDao {

	EntityManagerFactory fabrica;
	EntityManager em;
	
	public CarrerasDaoImpl() {
		super();
		fabrica = Persistence.createEntityManagerFactory("Semana01-Alt");
		em = fabrica.createEntityManager();
	}
	
	@Override
	public void create(Carreras carreras) {
		em.getTransaction().begin();
		em.persist(carreras);
		em.getTransaction().commit();
	}

	@Override
	public void update(Carreras carreras) {
		em.getTransaction().begin();
		em.merge(carreras);
		em.getTransaction().commit();
	}

	@Override
	public void delete(Integer id) {
		em.getTransaction().begin();
		em.remove(id);
		em.getTransaction().commit();
	}

	@Override
	public Carreras find(Integer id) {
		return em.find(Carreras.class, id);
	}

	@Override
	public List<Carreras> findAll() {
		Query query = em.createNamedQuery("Carreras.findAll");
		List<Carreras> lista;
		try {
			lista = query.getResultList();
		} catch (Exception e) {
			lista = null;
		}
		return lista;
	}

}
