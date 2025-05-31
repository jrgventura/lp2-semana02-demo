package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the rol database table.
 * 
 */
@Entity
@Table(name = "rol")
@NamedQuery(name="Rol.findAll", query="SELECT r FROM Rol r")
public class Rol { // implements Serializable {
	// private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idrol")
	private int idrol;

	@Column(name = "rolName")
	private String rolName;

	@Column(name = "rolStatus")
	private int rolStatus;
	
	// One Rol -> tiene -> Many Usuarios 
	// mappedBy -> Este atributo debe ser el mismo que el nombre del campo en la clase 
	// User que representa la relación
	@OneToMany(mappedBy="rol")
	private List<User> users;
		
	public Rol() {
	}

	public int getIdrol() {
		return this.idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	public String getRolName() {
		return this.rolName;
	}

	public void setRolName(String rolName) {
		this.rolName = rolName;
	}

	public int getRolStatus() {
		return this.rolStatus;
	}

	public void setRolStatus(int rolStatus) {
		this.rolStatus = rolStatus;
	}
	
	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setRol(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setRol(null);

		return user;
	}

}