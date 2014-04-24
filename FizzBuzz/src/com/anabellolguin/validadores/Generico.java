package com.anabellolguin.validadores;

import com.anabellolguin.interfaces.IValidador;

public abstract class Generico implements IValidador {
	
	private String valor;
	
	public Generico(String valor) {
		this.valor = valor;
	}
	
	public String valor() {
		return valor;
	}

	@Override
	public abstract boolean validar(int num);
}
