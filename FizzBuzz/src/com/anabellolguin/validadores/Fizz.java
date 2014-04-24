package com.anabellolguin.validadores;

import com.anabellolguin.interfaces.IValidador;

public class Fizz extends Generico {

	public Fizz(){
		super("Fizz");
	}
	
	public boolean validar(int num){
		return (num % 3 == 0);
	}
}
