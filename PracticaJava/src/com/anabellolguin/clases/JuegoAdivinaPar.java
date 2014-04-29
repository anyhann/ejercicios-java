package com.anabellolguin.clases;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {
	private int intentos;

	public JuegoAdivinaPar(int numeroVidas) {
		super(numeroVidas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void juega() {
		System.out.print("Este es el Juego Par. ");
		super.juega();
	}

	@Override
	public String muestraNombre() {
		return "1.-Adivina un numero par!";
	}

	@Override
	public void muestraInfo() {
		System.out
				.println("Este juego consiste en adivinar un numero par, de 0 al "
						+ "10, disponiendo de " + intentos + " intentos.");
	}

	public boolean validaNumero(int num) {
		if (num < 0 || num > 10) {
			System.out.println("Introduce un numero del 0 al 10");
		}
		if (0 != num % 2) {
			System.out.println(" No has introducido un numero par!");
			return false;
		} else
			return true;
	}

}
