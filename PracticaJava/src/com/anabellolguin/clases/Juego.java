package com.anabellolguin.clases;

public abstract class Juego {

	private int numVidasInicial;
	private int vidas;
	private static int record = 0;

	public Juego(int numeroVidas) {
		this.numVidasInicial = numeroVidas;
		this.vidas = numeroVidas;
	}

	public void muestraVidasRestantes() {
		System.out.print(this.obtenerVidasRestantes());
	}

	public int obtenerVidasRestantes() {
		return  this.vidas;
	}

	public boolean quitaVida() {	
		boolean a = true;
		this.vidas--;
		System.out.println("Te quedan " + vidas + " vidas");
		if (this.vidas == 0) {
			System.out.println("Juego Terminado");
			a = false;
		}
		return a;
	}

	public void reiniciaPartida() {
		this.vidas = this.numVidasInicial;
	}

	public void actualizaRecord() {
		if (this.vidas > Juego.record) {
			System.out.println("Has superado el record");
			Juego.record = this.vidas;
		} else if (this.vidas == Juego.record) {
			System.out.println("Has igualado el record");
		}
	}
	
	public int obtenerRecord() {
		return record;
	}

	public String getVidas() {
		return String.valueOf(vidas);
	}

	

}
