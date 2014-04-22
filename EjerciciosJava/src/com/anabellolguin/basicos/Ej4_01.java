package com.anabellolguin.basicos;

import java.util.Scanner;



public class Ej4_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int radio;
		float volumen, superficie;
		
		//leer un numero desde la entrada
		Scanner entrada = new Scanner(System.in);
		radio = entrada.nextInt();
		
		volumen = (float) ((4/3) * Math.pow(radio, 3));
		superficie = (float) (4 * Math.PI * Math.pow(radio, 2));
		
		System.out.println("El volumen de la esfera es:" + volumen);
		System.out.println("La superficie de la esfera es:" + superficie);
		
		
		

	}

}
