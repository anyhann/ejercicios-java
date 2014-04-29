package com.anabellolguin.clases;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
	private int intentos;

	public JuegoAdivinaImpar(int numeroVidas) {
		super(numeroVidas);

	}

	@Override
	public void juega() {
		System.out.print("Este es el Juego Impar. ");
		super.juega();
	}

	public boolean validaNumero(int num) {
		if (num < 0 || num > 10) {
			System.out.println("Introduce un numero del 0 al 10");
		}
		if (0 == num % 2) {
			System.out.println(" No has introducido un numero Impar!");
			return false;
		} else
			return true;
	}

	@Override
	public String muestraNombre() {
		return "2.-Adivina un numero Impar!";
	}

	@Override
	public void muestraInfo() {
		System.out
				.println("Este juego consiste en adivinar un numero pImpar, de 0 al "
						+ "10, disponiendo de " + intentos + " intentos.");
	}

}
