package com.anabellolguin.validadores;

import com.anabellolguin.interfaces.IValidador;

public class Buzz extends Generico{

	public Buzz(){
		super("Buzz");
	}
	
	public boolean validar(int num){
		return (num % 5 == 0);
	}
}
