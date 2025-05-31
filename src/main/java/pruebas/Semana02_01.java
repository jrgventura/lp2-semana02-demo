package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Rol;
import model.User;

public class Semana02_01 {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Semana01-Alt");
		EntityManager em = fabrica.createEntityManager();
		
		Rol rol = em.find(Rol.class, 2);
		List<User> usuariosConEsteRol = rol.getUsers();
		
		for(User r: usuariosConEsteRol) {
			System.out.println(r);
			System.out.println(r.getIduser());
			System.out.println(r.getEmail());
		}
		
	}

}
