package com.acme.dr.entidades;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DR_USUARIOS")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name="CODIGO_USUARIO")
	private Integer codUsuario;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="USUARIO")
	private String usuario;
	@Column(name="CLAVE")
	private String clave;
	@Column(name="ESTADO")
	private String estado;

	@ManyToOne
	@JoinColumn(name = "CODIGO_ROL", referencedColumnName = "CODIGO_ROL")
	private Rol rol;

	public Usuario() {}

	public Usuario(Integer codUsuario, String nombre, String usuario, String clave, String estado, Rol rol) {
		this.codUsuario = codUsuario;
		this.nombre = nombre;
		this.usuario = usuario;
		this.clave = clave;
		this.estado = estado;
		this.rol = rol;
	}

	public Integer getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(Integer codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Usuario [codUsuario=" + codUsuario + ", nombre=" + nombre + ", usuario=" + usuario + ", clave=" + clave
				+ ", estado=" + estado + ", rol=" + rol + "]";
	}

}