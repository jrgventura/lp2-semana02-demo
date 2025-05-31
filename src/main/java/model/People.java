package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the people database table.
 * 
 */
@Entity
@NamedQuery(name="People.findAll", query="SELECT p FROM People p")
public class People implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idpeople;

	private String lastname;

	private String name;

	//bi-directional many-to-one association to User
	// @OneToMany(mappedBy="people")
	// private List<User> users;
	@OneToOne(mappedBy="people")
	private User user;
	
	public People() {
	}

	public int getIdpeople() {
		return this.idpeople;
	}

	public void setIdpeople(int idpeople) {
		this.idpeople = idpeople;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}*/
	
	public User getUsers() {
		return this.user;
	}

	public void setUsers(User users) {
		this.user = users;
	}

	

}