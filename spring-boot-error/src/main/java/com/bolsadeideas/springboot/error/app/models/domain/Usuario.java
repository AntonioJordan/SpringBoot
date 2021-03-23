package com.bolsadeideas.springboot.error.app.models.domain;

public class Usuario {
	private Integer id;
	private String nombre;
	private String apellido;

	public Usuario(Integer id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Usuario() {

	}

	public final Integer getId() {
		return id;
	}

	public final void setId(Integer id) {
		this.id = id;
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
