package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="estudiante")
@NamedQuery(name="Estudiante2.findAll", query="SELECT e FROM Estudiante2 e")
public class Estudiante2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEstudiante;

	private String carrera;

	private String documento;

	private String nombresApellidos;

	private String telefono;

	//bi-directional many-to-one association to Tipodocumento
	// Many Estudiantes - One TipoDocumento
	@ManyToOne
	@JoinColumn(name="tipoDocumento")
	private Tipodocumento tipodocumento;

	public Estudiante2() {
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

	public Tipodocumento getTipodocumento() {
		return this.tipodocumento;
	}

	public void setTipodocumento(Tipodocumento tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

}