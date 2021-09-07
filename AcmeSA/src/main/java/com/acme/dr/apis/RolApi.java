package com.acme.dr.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.dr.modelos.ModelRol;
import com.acme.dr.servicios.RolServi;

@RestController
@RequestMapping("/roles")
public class RolApi {

	@Autowired
	private RolServi rolServ;

	@PostMapping("/registra")
	public void registraRol(@RequestBody ModelRol modRol) {
		System.out.println("Inicia proceso: " + modRol.toString());
		rolServ.registraRol(modRol);
	}

	@GetMapping("/listar")
	public List<ModelRol> listarRoles() {
		return rolServ.listarRoles();
	}

}
