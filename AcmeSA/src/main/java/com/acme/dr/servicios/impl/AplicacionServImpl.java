package com.acme.dr.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acme.dr.convertidores.ConvAplicacionModelo;
import com.acme.dr.entidades.Aplicacion;
import com.acme.dr.modelos.ModelAplicacion;
import com.acme.dr.repositorios.AplicacionRepo;
import com.acme.dr.servicios.AplicacionServi;

@Service
@Transactional
public class AplicacionServImpl implements AplicacionServi {

	@Autowired
	private AplicacionRepo apliRepo;

	@Autowired
	private ConvAplicacionModelo conApli;

	@Override
	public void registraAplicacion(ModelAplicacion modApli) {
		if (modApli.getCodAplicacion() == null) {
			Integer codigo = apliRepo.obtieneMaxCodAplicacion() + 1;
			modApli.setCodAplicacion(codigo);
		}
		apliRepo.save(conApli.convierteEntidad(modApli));
	}

	@Override
	public ModelAplicacion obtieneAplicacionCodigo(Integer codigo) {
		Aplicacion a = apliRepo.findById(codigo).orElse(null);
		return conApli.convierteModelo(a);
	}

	@Override
	public List<ModelAplicacion> listarAplicaciones() {
		List<Aplicacion> aps = apliRepo.findAll();
		return conApli.convirteModelos(aps);
	}

}
