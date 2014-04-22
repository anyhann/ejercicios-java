package com.anabellolguin.bucles;

import java.util.Scanner;

public class Ej4_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int numero, intentos = 0;
		boolean acertado = false;

		// leer un numero desde la entrada
		Scanner entrada = new Scanner(System.in);

		int x = (int) (100 * Math.random() + 1);
		System.out.print(x);
		
		while (!acertado && intentos < 5) {
			System.out.print("Introduce un numero: ");
			numero = entrada.nextInt();

			if (numero > x) {
				System.out.print("el numero a adivinar es menor: ");
			} else if (numero < x) {
				System.out.print("el numero a adivinar es mayor: ");
			} else if (numero == x) {
				System.out.print("Has adivinado el numero");
				acertado = true;
			}
		}

	}

}
