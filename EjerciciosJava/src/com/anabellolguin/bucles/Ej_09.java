package com.anabellolguin.bucles;

import java.util.Scanner;

public class Ej_09 {

	
	public static void main(String[] args) {
		  Scanner leer = new Scanner(System.in); // Crear objeto de la clase Scanner para 
          // poder leer los datos

			System.out.print("Introduce el Numero: ");
			int numero = leer.nextInt(); // Leer dato
			int factorial = 1; // declarar e inicializar factorial en 1
			
			while(numero != 0)
			{
			factorial *= numero;
			numero--;
			}
			
			System.out.print("Factorial: " + factorial); // Imprimir factorial


	}

}
