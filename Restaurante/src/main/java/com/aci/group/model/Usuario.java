package com.aci.group.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String apellidos;
	
	@Column(unique = true, nullable = false, length = 64)
	@Email
	@NotBlank
	@Size(max = 64)
	private String correo;
	private String contrasenia;
	private String usuario_ref;

//	@ManyToOne(cascade = CascadeType.ALL)
	@ManyToOne()
	@JoinTable(name="cupon")
	@JoinColumn(name = "idcupon")
	private Cupon idcup;
	
	
	
	public Usuario( String nombre, String apellidos, @Email @NotBlank @Size(max = 64) String correo,
			String contrasenia, String usuario_ref) {
		super();
//		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.usuario_ref = usuario_ref;
//		this.idcup = idcup;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	} 

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getUsuario_ref() {
		return usuario_ref;
	}

	public void setUsuario_ref(String usuario_ref) {
		this.usuario_ref = usuario_ref;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cupon getIdcup() {
		return idcup;
	}

	public void setIdcup(Cupon idcup) {
		this.idcup = idcup;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo
				+ ", contrasenia=" + contrasenia + ", usuario_ref=" + usuario_ref + ", idcup=" + idcup + "]";
	}



}
