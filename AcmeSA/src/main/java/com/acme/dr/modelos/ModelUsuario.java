package com.acme.dr.modelos;

public class ModelUsuario {

	private Integer codUsuario;
	private String nombre;
	private String usuario;
	private String clave;
	private String estado;
	private Integer codRol;

	public ModelUsuario() {}

	public ModelUsuario(Integer codUsuario, String nombre, String usuario, String clave, String estado,
			Integer codRol) {
		this.codUsuario = codUsuario;
		this.nombre = nombre;
		this.usuario = usuario;
		this.clave = clave;
		this.estado = estado;
		this.codRol = codRol;
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

	public Integer getCodRol() {
		return codRol;
	}

	public void setCodRol(Integer codRol) {
		this.codRol = codRol;
	}

	@Override
	public String toString() {
		return "ModelUsuario [codUsuario=" + codUsuario + ", nombre=" + nombre + ", usuario=" + usuario + ", clave="
				+ clave + ", estado=" + estado + ", codRol=" + codRol + "]";
	}

}
