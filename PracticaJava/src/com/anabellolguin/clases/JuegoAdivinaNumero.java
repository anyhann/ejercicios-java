package com.anabellolguin.clases;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

//import com.anabellolguin.interfaces.Jugable;

public class JuegoAdivinaNumero extends Juego implements Jugable{

	private int numSecreto, intentos = 3;
	private Random random;

	public JuegoAdivinaNumero(int numeroVidas) {
		super(numeroVidas);
		random = new Random((new Date()).getTime());
		this.numSecreto = random.nextInt(10);
		
		System.out.println(this.numSecreto);

	}

	public String muestraNombre() {
		return "0.-Adivina un numero!";
	}

	public void muestraInfo() {
		System.out
				.println("Este juego consiste en adivinar un numero, de 0 al "
						+ "10, disponiendo de " + intentos + " intentos");
	}

	public void juega() {
		int numero;
		boolean tienevidas = true;
		reiniciaPartida();

		do {
			System.out.print("Adivina un numerico del 0 al 10:");
			Scanner entrada = new Scanner(System.in);
			numero = entrada.nextInt();
			if (validaNumero(numero)) {
				if (numero == this.numSecreto) {
					System.out.println("\nlo has acertado!!!");
					return;
				} else {
					tienevidas = quitaVida();
					if (tienevidas)
						System.out.println("\nIntentalo otra vez");
					else
						System.out.println("\nYa no tienes vidas");
				}
			}
		} while (tienevidas);
		return;
	}

	private boolean validaNumero(int num) {
		if (0 < num && num < 10)
			return true;
		else {
			System.out.println("El numero que has introducido, no está entre"
					+ " 0 y 10");
			return false;
		}
	}

	
}
