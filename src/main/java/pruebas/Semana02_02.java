package pruebas;

import daos.UserDao;
import daos.UserDaoImpl;
import model.Rol;
import model.User;

public class Semana02_02 {

	public static void main(String[] args) {
		
		UserDao dao = new UserDaoImpl();
		
		User user = dao.find(1);
		Rol rol = user.getRol();
		
		System.out.println(user.getIduser());
		System.out.println(user.getEmail());
		System.out.println(rol.getIdrol());
		System.out.println(rol.getRolName());
		
	}

}
