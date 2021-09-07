package com.acme.dr.servicios;

import java.util.List;

import com.acme.dr.modelos.ModelAplicacion;

public interface AplicacionServi {

	public void registraAplicacion(ModelAplicacion modApli);
	public ModelAplicacion obtieneAplicacionCodigo(Integer codigo);
	public List<ModelAplicacion> listarAplicaciones();

}
