package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Estudiante;
import model.Rol;

public class EstudianteDaoImpl implements EstudianteDao {

	EntityManagerFactory fabrica;
	EntityManager em;
	
	public EstudianteDaoImpl() {
		super();
		fabrica = Persistence.createEntityManagerFactory("Semana01");
		em = fabrica.createEntityManager();
	}
	
	@Override
	public void create(Estudiante estudiante) {
		em.getTransaction().begin();
		em.persist(estudiante);
		em.getTransaction().commit();
	}

	@Override
	public void update(Estudiante estudiante) {
		em.getTransaction().begin();
		em.merge(estudiante);
		em.getTransaction().commit();
	}

	@Override
	public void delete(Integer id) {
		em.getTransaction().begin();
		em.remove(id);
		em.getTransaction().commit();
	}

	@Override
	public Estudiante find(Integer id) {
		return em.find(Estudiante.class, id);
	}

	@Override
	public List<Estudiante> findAll() {
		// Query query = em.createNamedQuery("SELECT r FROM Estudiante r");
		Query query = em.createNamedQuery("Estudiante.findAll");
		List<Estudiante> lista;
		try {
			lista = query.getResultList();
		} catch (Exception e) {
			lista = null;
		}
		return lista;
	}

}
