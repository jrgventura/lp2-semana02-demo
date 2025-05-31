package daos;

import java.util.List;

import model.Rol;

public interface RolDao {
	
	public void create(Rol rol);
	
	public void update(Rol rol);
	
	public void delete(Integer rol);
	
	public Rol find(Integer id);
	
	public List<Rol> findAll();

}
