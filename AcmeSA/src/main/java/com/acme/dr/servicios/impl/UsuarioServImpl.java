package com.acme.dr.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acme.dr.convertidores.ConvUsuarioModelo;
import com.acme.dr.entidades.Usuario;
import com.acme.dr.modelos.ModelUsuario;
import com.acme.dr.repositorios.UsuarioRepo;
import com.acme.dr.servicios.UsuarioServi;

@Service
@Transactional
public class UsuarioServImpl implements UsuarioServi {

	@Autowired
	private UsuarioRepo usuRepo;

	@Autowired
	private ConvUsuarioModelo conUsuario;

	@Override
	public void registraUsuario(ModelUsuario modUsuario) {
		if (modUsuario.getCodUsuario() == null) {
			Integer codigo = usuRepo.obtenerMaxCodUsuario() + 1;
			modUsuario.setCodUsuario(codigo);
		}
		usuRepo.save(conUsuario.convierteEntidad(modUsuario));
		
	}

	@Override
	public ModelUsuario obtineUsuarioCodigo(Integer codigo) {
		Usuario u = usuRepo.findById(codigo).orElse(null);
		return conUsuario.convierteModelo(u);
	}

	@Override
	public ModelUsuario obtineUsuario(String usuario) {
		Usuario u = usuRepo.obtieneUsuario(usuario);
		return conUsuario.convierteModelo(u);
	}

	@Override
	public List<ModelUsuario> listarUsuarios() {
		List<Usuario> us = usuRepo.findAll();
		return conUsuario.convirteModelos(us);
	}

}
