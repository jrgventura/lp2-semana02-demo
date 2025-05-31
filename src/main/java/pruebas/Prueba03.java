package pruebas;


import daos.RolDao;
import daos.RolDaoImpl;
import model.Rol;

public class Prueba03 {

	public static void main(String[] args) {
		
		RolDao dao = new RolDaoImpl();
		Rol rol = new Rol();
		rol.setRolName("Tesorero");
		rol.setRolStatus(1);
		
		dao.create(rol);

	}

}
