package pruebas;

import daos.RolDao;
import daos.RolDaoImpl;
import daos.RolDaoImpl2;
import model.Rol;

public class Prueba05 {

public static void main(String[] args) {
		
		RolDao dao = new RolDaoImpl2(Rol.class);
		Rol rol = new Rol();
		rol.setRolName("presidente");
		rol.setRolStatus(1);
		
		dao.create(rol);

	}
	
}
