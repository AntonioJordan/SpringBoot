package com.bolsadeideas.springboot.error.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;
import com.bolsadeideas.springboot.error.app.services.UsuarioService;

@SuppressWarnings("unused")
@Controller
public class AppController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping({"/index", "/"})
	public String index() {
		//Integer valor= 100/0;
		Integer valor= Integer.parseInt("10x");
		return "index";
	}
	
	@GetMapping("/ver/{id}")
	public String ver(@PathVariable Integer id, Model model) {
		Usuario usuario= usuarioService.getById(id);
		model.addAttribute("usuario", usuario);
		model.addAttribute("title", "Detalle usuario: ".concat(usuario.getNombre()));
		return "ver";
	}
}
