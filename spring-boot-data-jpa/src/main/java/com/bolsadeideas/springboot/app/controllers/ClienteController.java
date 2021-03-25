package com.bolsadeideas.springboot.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsadeideas.springboot.app.dao.IClienteDao;
import com.bolsadeideas.springboot.app.models.entity.Cliente;

@Controller
public class ClienteController {

	@Autowired
	@Qualifier("clienteDaoJPA")
	private IClienteDao clienteDao;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("title", "Listado de clientes");
		model.addAttribute("clientes", clienteDao.findAll());

		return "listar";
	}

	@GetMapping("/form")
	public String crear(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		model.addAttribute("title", "Formulario de cliente");
		
		return "form";
	}
	
	@RequestMapping(value="/form/{id}", method = RequestMethod.GET)
	public String editar(@PathVariable(value="id") Long id, Model modelo) {
		Cliente cliente = null;
		if(id>0) {
			cliente= clienteDao.findOneById(id);
		} else {
			modelo.addAttribute("title", "Listado de clientes");
			return "redirect:/listar";
		}
		modelo.addAttribute("cliente", cliente);
		modelo.addAttribute("title", "Editar cliente");
		return "form";
	}
	
	@PostMapping("/form")
	public String guardar(@Valid @ModelAttribute("cliente") Cliente cliente, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("title", "Formulario de cliente");
			return "form";
		}
		clienteDao.save(cliente);
		return "redirect:listar";
	}
	
	@GetMapping(value="eliminar/{id}")
	public String eliminar(@PathVariable(value="id") Long id, Model modelo) {
		if(id>0) {
			clienteDao.delete(id);
		}
		return "redirect:/listar";
	}
}
