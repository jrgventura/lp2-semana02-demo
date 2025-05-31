package pruebas;

import daos.RolDao;
import daos.RolDaoImpl;
import model.Rol;

public class Prueba04 {

public static void main(String[] args) {
		
		RolDao dao = new RolDaoImpl();
		Rol rol = new Rol();
		rol.setRolName("gerente");
		rol.setRolStatus(1);
		
		dao.create(rol);
		
		for(Rol r: dao.findAll()) {
			System.out.println(r);
			System.out.println(r.getIdrol());
			System.out.println(r.getRolName());
			System.out.println(r.getRolStatus());
		}

	}
	
}
