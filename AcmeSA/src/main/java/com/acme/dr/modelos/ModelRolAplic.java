package com.acme.dr.modelos;

public class ModelRolAplic {

	private Integer codRolAplica;
	private Integer codRol;
	private Integer codAplicacion;

	public ModelRolAplic() {}

	public ModelRolAplic(Integer codRolAplica, Integer codRol, Integer codAplicacion) {
		this.codRolAplica = codRolAplica;
		this.codRol = codRol;
		this.codAplicacion = codAplicacion;
	}

	public Integer getCodRolAplica() {
		return codRolAplica;
	}

	public void setCodRolAplica(Integer codRolAplica) {
		this.codRolAplica = codRolAplica;
	}

	public Integer getCodRol() {
		return codRol;
	}

	public void setCodRol(Integer codRol) {
		this.codRol = codRol;
	}

	public Integer getCodAplicacion() {
		return codAplicacion;
	}

	public void setCodAplicacion(Integer codAplicacion) {
		this.codAplicacion = codAplicacion;
	}

	@Override
	public String toString() {
		return "ModelRolAplic [codRolAplica=" + codRolAplica + ", codRol=" + codRol + ", codAplicacion=" + codAplicacion
				+ "]";
	}

}