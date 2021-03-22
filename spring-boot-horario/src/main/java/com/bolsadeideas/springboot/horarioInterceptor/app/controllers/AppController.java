package com.bolsadeideas.springboot.horarioInterceptor.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@Value("${config.horario.apertura}")
	private Integer apertura;
	@Value("${config.horario.cierre}")
	private Integer cierre;
	
	@GetMapping({"/", "/index"})
	public String index(Model model) {
		model.addAttribute("title", "Bienvenido al horario de atencion a clientes");
		return "index";
	}
	
	@GetMapping("/cerrado")
	public String cerrado(Model model) {
		System.out.println("doidncoidncidncdicndicnd");

		StringBuilder mensaje= new StringBuilder("Cerrado, por favor visítenos desde las ");
		mensaje.append(apertura);
		mensaje.append(" y las");
		mensaje.append(cierre);
		mensaje.append(" hrs. Gracias.");
		model.addAttribute("title", "Fuera del horario de atención");
		model.addAttribute("mensaje", mensaje);
		return "cerrado";
	}
}
