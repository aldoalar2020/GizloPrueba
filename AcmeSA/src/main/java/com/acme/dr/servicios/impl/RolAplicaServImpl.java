package com.acme.dr.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acme.dr.convertidores.ConvRolApliModelo;
import com.acme.dr.entidades.RolAplicacion;
import com.acme.dr.modelos.ModelRolAplic;
import com.acme.dr.repositorios.RolAplicaRepo;
import com.acme.dr.servicios.RolAplicaServi;

@Service
@Transactional
public class RolAplicaServImpl implements RolAplicaServi {

	@Autowired
	private RolAplicaRepo rolAplRepo;

	@Autowired
	private ConvRolApliModelo conRolApli;

	@Override
	public void registraRolAplica(ModelRolAplic modRolApl) {
		if (modRolApl.getCodRolAplica() == null) {
			Integer codigo = rolAplRepo.obtenerMaxCodRolAplica() + 1;
			modRolApl.setCodRolAplica(codigo);
		}
		rolAplRepo.save(conRolApli.convierteEntidad(modRolApl));
	}

	@Override
	public List<ModelRolAplic> obtieneAplicacionesRol(Integer codRol) {
		List<RolAplicacion> ra = rolAplRepo.obtenerAplicacionesRol(codRol);
		return conRolApli.convirteModelos(ra);
	}

}
