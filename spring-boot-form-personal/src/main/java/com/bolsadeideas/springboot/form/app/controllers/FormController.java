package com.bolsadeideas.springboot.form.app.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.bolsadeideas.springboot.form.app.models.domain.Usuario;

@Controller
@SessionAttributes("usuario")
public class FormController {
	@GetMapping({ "/form", "", "/" })
	public String form(Usuario usuario, Model model) {
		usuario.setNombre("Toni");
		usuario.setApellido("Jordan");
		usuario.setIdentificador("123.587.210B");
		model.addAttribute("titulo", "Formulario usuario");
		model.addAttribute("usuario", usuario);
		return "form";
	}

	@PostMapping("/resultado")
	public String procesar(@Valid Usuario usuario, BindingResult result, Model model, SessionStatus status) {

//		usuario.setUsername(request.getParameter("username"));
//		usuario.setPassword(request.getParameter("password"));
//		usuario.setEmail(request.getParameter("email"));

		if (result.hasErrors()) {
			Map<String, String> errores = new HashMap<>();
			result.getFieldErrors().forEach(err -> {
				errores.put(err.getField(),
						"El campo ".concat(err.getField().concat(" ").concat(err.getDefaultMessage())));
			});
			model.addAttribute("error", errores);
			return "form";
		}

		model.addAttribute("titulo", "Resultado formulario:");
		model.addAttribute("usuario", usuario);
		status.setComplete();
		return "resultado";
	}
}
