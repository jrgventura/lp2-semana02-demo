package model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
//@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
@NamedQueries({
	@NamedQuery(name="User.findAll", query="SELECT e FROM User e"),
	@NamedQuery(name="User.findByEmail", query="SELECT e FROM User e WHERE e.email =:email AND e.password = :password")
})
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int iduser;

	private String email;

	private String password;

	//bi-directional many-to-one association to People
	// Many Usuarios están asociados con Muchas Personas
	// @ManyToOne
	@OneToOne
	private People people;

	//bi-directional many-to-one association to Rol
	// Many Usuarios están asociados con One Rol 
	@ManyToOne
	private Rol rol;

	public User() {
	}

	public int getIduser() {
		return this.iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public People getPeople() {
		return this.people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}