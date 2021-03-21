package com.bolsadeideas.springboot.di.app.models.domain;

public class ItemFactura {
	private Producto producto;
	private Integer cantidad;

	public ItemFactura() {
		super();
	}
	
	public ItemFactura(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public final Producto getProducto() {
		return producto;
	}

	public final void setProducto(Producto producto) {
		this.producto = producto;
	}

	public final Integer getCantidad() {
		return cantidad;
	}

	public final void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
}
