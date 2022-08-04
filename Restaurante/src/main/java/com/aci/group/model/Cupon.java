package com.aci.group.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.OneToMany;
@Entity
@Table(name="cupon")
public class Cupon {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcupon;
	private String restaurante;
	private String rfc_restaurante;
	private String descripcion;
	private String estatus;
//	@OneToMany(targetEntity = Usuario.class, mappedBy = "id", orphanRemoval = false, fetch = FetchType.LAZY)
//	private List<Usuario> users;
	
	
	public Cupon(int idcupon, String restaurante, String rfc_restaurante, String descripcion, String estatus) {
		super();
		this.idcupon = idcupon;
		this.restaurante = restaurante;
		this.rfc_restaurante = rfc_restaurante;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}
	
	public Cupon(String estatus) {
		super();

		this.estatus = estatus;
	}

	public Cupon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	public Cupon(int idcupon, String restaurante, String rfc_restaurante, String descripcion, String estatus,
//			List<Usuario> users) {
//	super();
//		this.idcupon = idcupon;
//		this.restaurante = restaurante;
//		this.rfc_restaurante = rfc_restaurante;
//		this.descripcion = descripcion;
//		this.estatus = estatus;
//		this.users = users;
//	}
	
	
//	public List<Usuario> getUsers() {
//
//		return users;
//	}
//
//	public void setUsers(List<Usuario> users) {
//		this.users = users;
//	}

	public int getIdcupon() {
		return idcupon;
	}

	public void setIdcupon(int idcupon) {
		this.idcupon = idcupon;
	}
	public String getRestaurante() {
		return restaurante;
	}
	public void setRestaurante(String restaurante) {
		this.restaurante = restaurante;
	}
	public String getRfc_restaurante() {
		return rfc_restaurante;
	}
	public void setRfc_restaurante(String rfc_restaurante) {
		this.rfc_restaurante = rfc_restaurante;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	

	@Override
	public String toString() {
		return "Cupon [idcupon=" + idcupon + ", restaurante=" + restaurante + ", rfc_restaurante=" + rfc_restaurante
				+ ", descripcion=" + descripcion + ", estatus=" + estatus  + "]";
	}

	
}


