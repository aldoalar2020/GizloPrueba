package com.acme.dr.modelos;

public class ModelAplicacion {

	private Integer codAplicacion;
	private String nombre;
	private String descripcion;
	private String estado;

	public ModelAplicacion() {}

	public ModelAplicacion(Integer codAplicacion, String nombre, String descripcion, String estado) {
		this.codAplicacion = codAplicacion;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public Integer getCodAplicacion() {
		return codAplicacion;
	}

	public void setCodAplicacion(Integer codAplicacion) {
		this.codAplicacion = codAplicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "ModelAplicacion [codAplicacion=" + codAplicacion + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", estado=" + estado + "]";
	}

}
