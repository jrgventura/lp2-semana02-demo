package model;

import java.io.Serializable;
import javax.persistence.*;

import org.eclipse.persistence.annotations.PrimaryKey;


@Entity
@Table(name = "estudiante")
@NamedQueries({
	@NamedQuery(name="Estudiante.findAll", query="SELECT e FROM Estudiante e"),
	@NamedQuery(name="Estudiante.findByIdEst", query="SELECT e FROM Estudiante e WHERE e.idEstudiante =:idEstudiante")
})
public class Estudiante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idEstudiante")
	private int idEstudiante;

	private String carrera;

	private String documento;

	private String nombresApellidos;

	private String telefono;

	private int tipoDocumento;

	public Estudiante() {
	}

	public int getIdEstudiante() {
		return this.idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getCarrera() {
		return this.carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombresApellidos() {
		return this.nombresApellidos;
	}

	public void setNombresApellidos(String nombresApellidos) {
		this.nombresApellidos = nombresApellidos;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

}