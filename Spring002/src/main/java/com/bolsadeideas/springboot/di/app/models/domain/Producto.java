package com.bolsadeideas.springboot.di.app.models.domain;


public class Producto {
	private String nombre;
	private Integer precio;
	

	
	
	public Producto(String nombre, Integer precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto() {
		super();
	}

	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public final Integer getPrecio() {
		return precio;
	}

	public final void setPrecio(Integer precio) {
		this.precio = precio;
	}
}
