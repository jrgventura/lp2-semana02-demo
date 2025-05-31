package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Rol;

public class RolDaoImpl implements RolDao {

	EntityManagerFactory fabrica;
	EntityManager em;
	
	public RolDaoImpl() {
		super();
		fabrica = Persistence.createEntityManagerFactory("Semana01-Alt");
		em = fabrica.createEntityManager();
	}
	
	@Override
	public void create(Rol rol) {
		try {
			em.getTransaction().begin();
			em.persist(rol);
			em.getTransaction().commit();
		} catch (NullPointerException e) {
			em.getTransaction().rollback();
		}
		
	}

	@Override
	public void update(Rol rol) {
		em.getTransaction().begin();
		em.merge(rol);
		em.getTransaction().commit();
	}

	@Override
	public void delete(Integer id) {
		em.getTransaction().begin();
		em.remove(id);
		em.getTransaction().commit();
	}

	@Override
	public Rol find(Integer id) {
		return em.find(Rol.class, id);
	}

	@Override
	public List<Rol> findAll() {
		// Query query = em.createNamedQuery("SELECT r FROM Rol r");
		Query query = em.createNamedQuery("Rol.findAll");
		List<Rol> lista;
		try {
			lista = query.getResultList();
		} catch (Exception e) {
			lista = null;
		}
		return lista;
	}

}
