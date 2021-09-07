package com.acme.dr.servicios;

import java.util.List;

import com.acme.dr.modelos.ModelRol;

public interface RolServi {

	public void registraRol(ModelRol modRol);
	public ModelRol obtieneRolCodigo(Integer codigo);
	public List<ModelRol> listarRoles();

}
