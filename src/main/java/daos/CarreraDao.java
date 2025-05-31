package daos;

import java.util.List;

import model.Carreras;

public interface CarreraDao {
	
	public void create(Carreras carreras);
	
	public void update(Carreras carreras);
	
	public void delete(Integer id);
	
	public Carreras find(Integer id);
	
	public List<Carreras> findAll();

}