package com.acme.dr.servicios;

import java.util.List;

import com.acme.dr.modelos.ModelRolAplic;

public interface RolAplicaServi {

	public void registraRolAplica(ModelRolAplic modRolApl);
	public List<ModelRolAplic> obtieneAplicacionesRol(Integer codRol);

}
