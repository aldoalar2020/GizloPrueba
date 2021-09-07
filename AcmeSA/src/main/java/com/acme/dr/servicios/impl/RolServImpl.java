package com.acme.dr.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acme.dr.convertidores.ConvRolModelo;
import com.acme.dr.entidades.Rol;
import com.acme.dr.modelos.ModelRol;
import com.acme.dr.repositorios.RolRepo;
import com.acme.dr.servicios.RolServi;

@Service
@Transactional
public class RolServImpl implements RolServi {

	@Autowired
	private RolRepo rolRepo;

	@Autowired
	private ConvRolModelo conRol;

	@Override
	public void registraRol(ModelRol modRol) {
		if (modRol.getCodRol() == null) {
			Integer codigo = rolRepo.obtieneMaxCodRol() + 1;
			modRol.setCodRol(codigo);
		}
		rolRepo.save(conRol.convierteEntidad(modRol));
	}

	@Override
	public ModelRol obtieneRolCodigo(Integer codigo) {
		Rol r = rolRepo.findById(codigo).orElse(null);
		return conRol.convierteModelo(r);
	}

	@Override
	public List<ModelRol> listarRoles() {
		List<Rol> roles = rolRepo.findAll(); 
		return conRol.convirteModelos(roles);
	}

}
