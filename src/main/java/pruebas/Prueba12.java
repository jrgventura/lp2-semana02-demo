package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import daos.RolDao;
import daos.RolDaoImpl;
import daos.UserDao;
import daos.UserDaoImpl;
import model.Rol;
import model.User;

public class Prueba12 {

	public static void main(String[] args) {
		
		UserDao dao = new UserDaoImpl();
		
		User user = dao.login("emai01@cibertec.edu.pe", "123456");
		
		/*System.out.println(user);
		System.out.println(user.getEmail());
		System.out.println(user.getRol().getRolName());
		System.out.println(user.getPeople().getName());
		System.out.println(user.getPeople().getLastname());*/
	}

}
