package daos;

import java.util.List;

import model.Estudiante;

public interface EstudianteDao {
	
	public void create(Estudiante estudiante);
	
	public void update(Estudiante estudiante);
	
	public void delete(Integer id);
	
	public Estudiante find(Integer id);
	
	public List<Estudiante> findAll();

}
