package util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public abstract class AbstractEntity<T, V> {
	
	EntityManagerFactory emf;
	
	EntityManager em;
	
	Class<T> objeto;
	
	public AbstractEntity(Class<T> objeto) {
		emf = Persistence.createEntityManagerFactory("Semana01-Alt");
		em = emf.createEntityManager();
		this.objeto = objeto;
	}
	
	public void create(T t) {
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
	}
	
	public List<T> findAll() {
		List<T> lista;
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(objeto);
		Root<T> s = cq.from(objeto);
		cq.select(s);
		TypedQuery<T> q = em.createQuery(cq);
		lista = q.getResultList();
		return lista;
	}
	
	public void update(T t) {
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
	}
	
	public void delete(V id) {
		T c = find(id);
		em.getTransaction().begin();
		if(c!=null) {
			em.remove(c);
		}
		em.getTransaction().commit();
	}
	
	public T find(V id) {
		em.getTransaction().begin();
		T t = em.find(objeto, id);
		em.getTransaction().commit();
		return t;
	}
	
	public List<T> findRange(int[] range) {
		CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
		cq.select(cq.from(objeto));
		Query q = em.createQuery(cq);
		q.setMaxResults(range[1] - range[0] + 1);
		q.setFirstResult(range[0]);
		return q.getResultList();
	}
	
	public int count() {
		CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
		Root<T> rt = cq.from(objeto);
		cq.select(em.getCriteriaBuilder().count(rt));
		Query q = em.createQuery(cq);
		return ((Long) q.getSingleResult()).intValue();
	}
	

}
