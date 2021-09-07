package com.acme.dr.convertidores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.acme.dr.entidades.Aplicacion;
import com.acme.dr.modelos.ModelAplicacion;

@Component
public class ConvAplicacionModelo {

	public ModelAplicacion convierteModelo(Aplicacion a) {
		ModelAplicacion modelo = new ModelAplicacion();
		modelo.setCodAplicacion(a.getCodAplicacion());
		modelo.setNombre(a.getNombre());
		modelo.setDescripcion(a.getDescripcion());
		modelo.setEstado(a.getEstado());
		return modelo;
	}

	public Aplicacion convierteEntidad(ModelAplicacion m) {
		Aplicacion entidad = new Aplicacion();
		entidad.setCodAplicacion(m.getCodAplicacion());
		entidad.setNombre(m.getNombre());
		entidad.setDescripcion(m.getDescripcion());
		entidad.setEstado(m.getEstado());
		return entidad;
	}

	public List<ModelAplicacion> convirteModelos(List<Aplicacion> as) {
		List<ModelAplicacion> modelos = new ArrayList<>();
		for (Aplicacion a : as) {
			ModelAplicacion m = this.convierteModelo(a);
			modelos.add(m);
		}
		return modelos;
	}

	public List<Aplicacion> convirteEntidades(List<ModelAplicacion> ms) {
		List<Aplicacion> entidades = new ArrayList<>();
		for (ModelAplicacion m : ms) {
			Aplicacion a = this.convierteEntidad(m);
			entidades.add(a);
		}
		return entidades;
	}

}
