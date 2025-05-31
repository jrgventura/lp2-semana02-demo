package pruebas;

import daos.UserDao;
import daos.UserDaoImpl;
import model.People;
import model.User;

public class Semana02_03 {

	public static void main(String[] args) {
		
		UserDao dao = new UserDaoImpl();
		
		User user = dao.find(1);
		People people = user.getPeople();
		
		System.out.println(people.getName());
		System.out.println(people.getLastname());
		
	}

}
