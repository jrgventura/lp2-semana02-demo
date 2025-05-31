package pruebas;

import daos.UserDao;
import daos.UserDaoImpl;
import model.Rol;
import model.User;

public class Semana02_04 {

	public static void main(String[] args) {
		
		UserDao dao = new UserDaoImpl();
		
		User user = dao.login("emai01@cibertec.edu.pe", "123456");
		Rol rol = user.getRol();
		
		System.out.println(user.getIduser());
		System.out.println(user.getEmail());
		System.out.println(rol.getIdrol());
		System.out.println(rol.getRolName());
		
	}

}
