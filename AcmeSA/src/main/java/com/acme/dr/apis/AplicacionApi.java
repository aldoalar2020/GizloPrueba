package com.acme.dr.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.dr.modelos.ModelAplicacion;
import com.acme.dr.servicios.AplicacionServi;

@RestController
@RequestMapping("/aplicacion")
public class AplicacionApi {

	@Autowired
	private AplicacionServi apliServ;

	@PostMapping("/registrar")
	public void registraAplicacion(@RequestBody ModelAplicacion modApli) {
		apliServ.registraAplicacion(modApli);
	}

	@GetMapping("/listar")
	public List<ModelAplicacion> listarAplicaciones() {
		return apliServ.listarAplicaciones();
	}

}
