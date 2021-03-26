package com.bolsadeideas.springboot.app.dao.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	public void save(Cliente cliente);
	public Cliente findOneById(Long id);
	public void delete(Long id);
}
