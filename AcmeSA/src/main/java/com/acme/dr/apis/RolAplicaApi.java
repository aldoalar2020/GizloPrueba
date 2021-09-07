package com.acme.dr.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.dr.modelos.ModelRolAplic;
import com.acme.dr.servicios.RolAplicaServi;

@RestController
@RequestMapping("/rolaplica")
public class RolAplicaApi {

	@Autowired
	private RolAplicaServi rolAplServ;

	@PostMapping("/registrar")
	public void registraRolAplicacion(@RequestBody ModelRolAplic modRolApli) {
		rolAplServ.registraRolAplica(modRolApli);
	}

	@GetMapping("/listar/{codRol}")
	public List<ModelRolAplic> listarRolesAplicaciones(@PathVariable Integer codRol) {
		return rolAplServ.obtieneAplicacionesRol(codRol);
	}

}
