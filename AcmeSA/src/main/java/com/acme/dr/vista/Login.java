package com.acme.dr.vista;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.acme.dr.modelos.ModelUsuario;

@Controller
public class Login {

	

	@GetMapping("/")
    public String inicio(Model model){
        var usuario = new ModelUsuario();
        model.addAttribute("usuario", usuario);
        return "login";
    }

	@PostMapping("/login")
	public String login(ModelUsuario usu) {
		System.out.println("Principal: " + usu.toString());
		return "principal";
	}

}
