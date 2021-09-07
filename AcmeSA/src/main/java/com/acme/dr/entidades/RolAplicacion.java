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
@Table(name="DR_ROL_APLICACIONES")
public class RolAplicacion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name="COD_ROL_APLICACION")
	private Integer codRolAplica;
	
	@ManyToOne
	@JoinColumn(name = "CODIGO_ROL", referencedColumnName = "CODIGO_ROL")
	private Rol rol;

	@ManyToOne
	@JoinColumn(name = "CODIGO_APLICACION", referencedColumnName = "CODIGO_APLICACION")
	private Aplicacion aplicacion;

	public RolAplicacion() {}

	public RolAplicacion(Integer codRolAplica, Rol rol, Aplicacion aplicacion) {
		super();
		this.codRolAplica = codRolAplica;
		this.rol = rol;
		this.aplicacion = aplicacion;
	}

	public Integer getCodRolAplica() {
		return codRolAplica;
	}

	public void setCodRolAplica(Integer codRolAplica) {
		this.codRolAplica = codRolAplica;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Aplicacion getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

	@Override
	public String toString() {
		return "UsuarioRolAplicacion [codRolAplica=" + codRolAplica + ", rol=" + rol
				+ ", aplicacion=" + aplicacion + "]";
	}

}
