package com.acme.dr.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.dr.modelos.ModelUsuario;
import com.acme.dr.servicios.UsuarioServi;

@RestController
@RequestMapping("/usuarios")
public class UsuarioApi {

	@Autowired
	private UsuarioServi usuServ;

	@PostMapping("/registrar")
	public void registraUsuario(@RequestBody ModelUsuario modUsuario) {
		usuServ.registraUsuario(modUsuario);
	}

	@GetMapping("/listar")
	public List<ModelUsuario> listarUsuarios() {
		return usuServ.listarUsuarios();
	}

	@PostMapping("/validar")
	public String validaUsuario(@RequestBody ModelUsuario modUsuario) {
		String mensaje = "";
		ModelUsuario uVerifica = usuServ.obtineUsuario(modUsuario.getUsuario());
		if (uVerifica == null) {
			mensaje = "Usuario no existe";
		} else {
			if (uVerifica.getClave().equals(modUsuario.getClave())) {
				mensaje = "Exito";
			} else {
				mensaje = "Clave incorrecta";
			}
		}
		return mensaje;
	}

}
