package pruebas;

import daos.UserDao;
import daos.UserDaoImpl;
import model.People;
import model.User;

public class Semana02_05 {

	public static void main(String[] args) {
		
		UserDao dao = new UserDaoImpl();
		
		User user = dao.login("emai01@cibertec.edu.pe", "123456");
		People people = user.getPeople();
		
		System.out.println(people.getName());
		System.out.println(people.getLastname());
		
	}

}
