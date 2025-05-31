package daos;

import model.User;

public interface UserDao {

	public User login(String email, String pass);

	public User find(Integer id);
}
