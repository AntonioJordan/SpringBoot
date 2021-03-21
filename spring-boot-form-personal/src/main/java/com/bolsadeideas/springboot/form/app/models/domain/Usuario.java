package com.bolsadeideas.springboot.form.app.models.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Usuario {

	private String identificador;
	@NotEmpty
	@Size(min = 3, max = 15)
	private String nombre;
	@NotEmpty
	private String apellido;
	@NotEmpty
	@Size(min = 3, max = 15)
	public String username;
	@NotEmpty
	public String password;
	@NotEmpty
	@Email
	public String email;

	public final String getUsername() {
		return username;
	}

	public final void setUsername(String username) {
		this.username = username;
	}

	public final String getPassword() {
		return password;
	}

	public final void setPassword(String password) {
		this.password = password;
	}

	public final String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
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

	public final String getIdentificador() {
		return identificador;
	}

	public final void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

}
