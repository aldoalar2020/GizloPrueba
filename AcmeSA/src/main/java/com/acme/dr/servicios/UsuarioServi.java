package com.acme.dr.servicios;

import java.util.List;

import com.acme.dr.modelos.ModelUsuario;

public interface UsuarioServi {

	public void registraUsuario(ModelUsuario modUsuario);
	public ModelUsuario obtineUsuarioCodigo(Integer codigo);
	public ModelUsuario obtineUsuario(String usuario);
	public List<ModelUsuario> listarUsuarios();

}
