package com.bolsadeideas.springboot.app.util.paginator;

public class PageItem {
	private int numero;
	private boolean actual;
	
	public PageItem(int numero, boolean actual) {
		this.numero = numero;
		this.actual = actual;
	}

	public final int getNumero() {
		return numero;
	}

	public final void setNumero(int numero) {
		this.numero = numero;
	}

	public final boolean isActual() {
		return actual;
	}

	public final void setActual(boolean actual) {
		this.actual = actual;
	}
}
