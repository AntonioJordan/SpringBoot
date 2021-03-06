package com.bolsadeideas.springboot.di.app.models.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
public class Cliente {
	@Value("${cliente.nombre}")
	private String nombre;
	@Value("${cliente.apellido}")
	private String apellido;

	public Cliente() {
		super();
	}
	
	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public final String getApellido() {
		return apellido;
	}

	public final void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
