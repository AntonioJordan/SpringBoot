package com.bolsadeideas.springboot.di.app.models.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
//Un componente es singleton inherentemente, para decir que no use singleton

public class Factura{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7854757614139041417L;
	@Value("${descripcion.factura}")
	private String descripcion;
	@Autowired
	private Cliente cliente;
	@Autowired
	private List<ItemFactura> items;
	
	
	public Factura() {
		super();
	}

	@PostConstruct
	public void inicializar() {
		cliente.setNombre(cliente.getNombre().concat(" ").concat("Jose"));
		descripcion= descripcion.concat(" del cliente: ").concat(cliente.getNombre());
	}

	@PreDestroy
	public void destruccion() {
		System.out.println("Factura destruida: ".concat(descripcion));
	}
	
	public final String getDescripcion() {
		return descripcion;
	}

	public final void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public final Cliente getCliente() {
		return cliente;
	}

	public final void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public final List<ItemFactura> getItems() {
		return items;
	}

	public final void setItems(List<ItemFactura> items) {
		this.items = items;
	}

}
