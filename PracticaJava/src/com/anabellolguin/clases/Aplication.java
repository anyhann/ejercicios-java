package com.anabellolguin.clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Jugable eligeJuego() {

		JuegoAdivinaNumero juegoNumero = new JuegoAdivinaNumero(5);
		JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(5);
		JuegoAdivinaImpar juegoimpar = new JuegoAdivinaImpar(5);

		ArrayList<Jugable> listaJuegos = new ArrayList<Jugable>();
		listaJuegos.add((Jugable) juegoNumero);
		listaJuegos.add((Jugable) juegoPar);
		listaJuegos.add((Jugable) juegoimpar);

		for (Jugable juego : listaJuegos) {

			System.out.println(juego.muestraNombre());

		}

		int entrada;

		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona un tipo de juego:");
		entrada = sc.nextInt();

		boolean continuar = true;
		int entrada2 = 0;

		while (continuar) {

			Scanner sc2 = new Scanner(System.in);
			System.out.println("Introduzca un nœmero entre el 0 y el 10: ");
			entrada2 = sc2.nextInt();

			if (entrada >= 0 && entrada <= 10) {
				continuar = false;
			} else {
				System.out.println("Numero fuera del rango");
			}
		}

		return listaJuegos.get(entrada);
	}

}
