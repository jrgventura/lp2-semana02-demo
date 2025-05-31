package model;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Carreras
 *
 */
@Entity
@Table(name = "carreras") // fuerza a usar minúsculas
//@NamedQuery(name="Carreras.findAll", query="SELECT t FROM Carreras t")
@NamedQueries({
	@NamedQuery(name="Carreras.findAll", query="SELECT e FROM Carreras e"),
	@NamedQuery(name="Carreras.findByIdEst", query="SELECT e FROM Carreras e WHERE e.id =:idcarrera")
})
public class Carreras implements Serializable {

	private static final long serialVersionUID = 1L;
	   
	@Id
	@Column(name = "idcarrera")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "carrera")
	private String carrera;
	
	@Column(name = "estado")
	private Boolean estado;
	

	public Carreras() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getCarrera() {
		return this.carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}   
	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
   
}
