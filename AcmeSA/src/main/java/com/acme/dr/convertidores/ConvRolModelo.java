package com.acme.dr.convertidores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.acme.dr.entidades.Rol;
import com.acme.dr.modelos.ModelRol;

@Component
public class ConvRolModelo {

	public ModelRol convierteModelo(Rol r) {
		ModelRol modelo = new ModelRol();
		modelo.setCodRol(r.getCodRol());
		modelo.setNombre(r.getNombre());
		modelo.setDescripcion(r.getDescripcion());
		modelo.setEstado(r.getEstado());
		return modelo;
	}

	public Rol convierteEntidad(ModelRol m) {
		Rol entidad = new Rol();
		entidad.setCodRol(m.getCodRol());
		entidad.setNombre(m.getNombre());
		entidad.setDescripcion(m.getDescripcion());
		entidad.setEstado(m.getEstado());
		return entidad;
	}

	public List<ModelRol> convirteModelos(List<Rol> rs) {
		List<ModelRol> modelos = new ArrayList<>();
		for (Rol r : rs) {
			ModelRol m = this.convierteModelo(r);
			modelos.add(m);
		}
		return modelos;
	}

	public List<Rol> convirteEntidades(List<ModelRol> ms) {
		List<Rol> entidades = new ArrayList<>();
		for (ModelRol m : ms) {
			Rol r = this.convierteEntidad(m);
			entidades.add(r);
		}
		return entidades;
	} 

}
