package com.anabellolguin.fizzbuzz;

import com.anabellolguin.validadores.Generico;
import com.anabellolguin.validadores.Buzz;
import com.anabellolguin.validadores.Fizz;

public class FizzBuzz {
	
	Generico validadores[] = new Generico[2];
	
	public void inicializarValidadores() {
		
		Fizz fizz = new Fizz();
		Buzz buzz = new Buzz();
		
		validadores[0] = fizz;
		validadores[1] = buzz;
	}

	public String calcular(int num) {
		
		inicializarValidadores();

		String cadena = "";
		
		
		for (int i = 1; i <= num; i++) {
			boolean validado = false;
			
			/*if (i == 1) {
				cadena += Integer.toString(i);
			} else if (fizz.validar(i) && buzz.validar(i)) {
				cadena += " " + fizz.valor() + buzz.valor();
			} else if (fizz.validar(i)) {
				cadena += " " + fizz.valor();
			} else if (buzz.validar(i)) {
				cadena += " " + buzz.valor();
			} else {
				cadena += " " + Integer.toString(i);
			}*/
			
			for(int j=0; j<validadores.length; j++) {
				if(validadores[j].validar(i)) {
					cadena += validadores[j].valor();
					validado = true;
				}
			}
			if(!validado)
				cadena += i;

			cadena += " ";
		}
		
		cadena = cadena.substring(0, cadena.length() - 1);

		return cadena;

	}
}
