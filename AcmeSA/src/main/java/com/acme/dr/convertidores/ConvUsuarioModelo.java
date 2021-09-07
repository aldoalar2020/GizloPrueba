package com.acme.dr.convertidores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.acme.dr.entidades.Rol;
import com.acme.dr.entidades.Usuario;
import com.acme.dr.modelos.ModelUsuario;

@Component
public class ConvUsuarioModelo {

	public ModelUsuario convierteModelo(Usuario u) {
		ModelUsuario modelo = new ModelUsuario();
		modelo.setCodUsuario(u.getCodUsuario());
		modelo.setNombre(u.getNombre());
		modelo.setUsuario(u.getUsuario());
		modelo.setClave(u.getClave());
		modelo.setEstado(u.getEstado());
		modelo.setCodRol(u.getRol().getCodRol());
		return modelo;
	}

	public Usuario convierteEntidad(ModelUsuario m) {
		Usuario entidad = new Usuario();
		entidad.setCodUsuario(m.getCodUsuario());
		entidad.setNombre(m.getNombre());
		entidad.setUsuario(m.getUsuario());
		entidad.setClave(m.getClave());
		entidad.setEstado(m.getEstado());
		Rol rol = new Rol();
		rol.setCodRol(m.getCodRol());
		entidad.setRol(rol);
		return entidad;
	}

	public List<ModelUsuario> convirteModelos(List<Usuario> us) {
		List<ModelUsuario> modelos = new ArrayList<>();
		for (Usuario u : us) {
			ModelUsuario m = this.convierteModelo(u);
			modelos.add(m);
		}
		return modelos;
	}

	public List<Usuario> convirteEntidades(List<ModelUsuario> ms) {
		List<Usuario> entidades = new ArrayList<>();
		for (ModelUsuario m : ms) {
			Usuario u = this.convierteEntidad(m);
			entidades.add(u);
		}
		return entidades;
	} 

}
