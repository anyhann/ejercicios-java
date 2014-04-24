package com.anabellolguin.clasesEstandar;

import java.util.Scanner;


public class PruebaDNI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String cadena;
		boolean res;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese DNI");
		cadena = entrada.next();
	
		res = ValidarDNI.nifValido(cadena);
		System.out.print(res);
		
		
		
		

	}

}
