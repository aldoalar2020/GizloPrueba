package com.acme.dr.convertidores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.acme.dr.entidades.Aplicacion;
import com.acme.dr.entidades.Rol;
import com.acme.dr.entidades.RolAplicacion;
import com.acme.dr.modelos.ModelRolAplic;

@Component
public class ConvRolApliModelo {

	public ModelRolAplic convierteModelo(RolAplicacion ura) {
		ModelRolAplic modelo = new ModelRolAplic();
		modelo.setCodRolAplica(ura.getCodRolAplica());
		modelo.setCodRol(ura.getRol().getCodRol());
		modelo.setCodAplicacion(ura.getAplicacion().getCodAplicacion());
		return modelo;
	}

	public RolAplicacion convierteEntidad(ModelRolAplic m) {
		RolAplicacion entidad = new RolAplicacion();
		entidad.setCodRolAplica(m.getCodRolAplica());
		Rol r = new Rol();
		entidad.setRol(r);
		Aplicacion a = new Aplicacion();
		entidad.setAplicacion(a);
		return entidad;
	}

	public List<ModelRolAplic> convirteModelos(List<RolAplicacion> uras) {
		List<ModelRolAplic> modelos = new ArrayList<>();
		for (RolAplicacion ura : uras) {
			ModelRolAplic m = this.convierteModelo(ura);
			modelos.add(m);
		}
		return modelos;
	}

	public List<RolAplicacion> convirteEntidades(List<ModelRolAplic> ms) {
		List<RolAplicacion> entidades = new ArrayList<>();
		for (ModelRolAplic m : ms) {
			RolAplicacion ura = this.convierteEntidad(m);
			entidades.add(ura);
		}
		return entidades;
	}
	
}
