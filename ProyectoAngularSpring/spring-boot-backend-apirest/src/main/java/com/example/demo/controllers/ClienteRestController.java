package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.Cliente;
import com.example.demo.models.services.IClienteService;

@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private IClienteService clientService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/clientes")
	public List<Cliente> index(){
		return clientService.findAll();
	}
}
