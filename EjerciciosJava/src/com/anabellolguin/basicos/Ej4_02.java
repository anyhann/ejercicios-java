package com.anabellolguin.basicos;

import java.util.Scanner;

public class Ej4_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int IMC;
		double peso, altura;
		
		//leer un numero desde la entrada
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la altura: ");
		altura = entrada.nextDouble();
		System.out.print("Introduce el peso: ");
		peso = entrada.nextDouble();
		
		IMC = (int) (peso / (Math.pow(altura,2)));
		 System.out.println("Su indice de masa corporal es:" + IMC);
		
		if(IMC < 16)
			System.out.println("Ingreso en el hospital:");
		else if(IMC > 16 && IMC < 17)
			System.out.println("Infrapeso:");
		else if(IMC <17 && IMC >18)
			System.out.println("Bajo peso:");
		else if(IMC <18 && IMC >25)
			System.out.println("peso normal saludable:");
		else if(IMC <25 && IMC>30)
			System.out.println("sobre peso:");
		else if(IMC <30 && IMC>35)
			System.out.println("sobre peso cronico:");
		else if(IMC <35  && IMC>40)
			System.out.println("Obecidad premorbida:");
		else if(IMC > 40)
			System.out.println("Obecidad morbida:");
		
	   

	}

}
