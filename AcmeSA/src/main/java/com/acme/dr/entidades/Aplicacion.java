package com.acme.dr.entidades;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DR_APLICACIONES")
public class Aplicacion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name="CODIGO_APLICACION")
	private Integer codAplicacion;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="DESCRIPCION")
	private String descripcion;
	@Column(name="ESTADO")
	private String estado;

	public Aplicacion() {}

	public Aplicacion(Integer codAplicacion, String nombre, String descripcion, String estado) {
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
		return "Aplicacion [codAplicacion=" + codAplicacion + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", estado=" + estado + "]";
	}

}