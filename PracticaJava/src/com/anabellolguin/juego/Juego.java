package com.anabellolguin.juego;

public abstract class Juego {
	private int numVidasInicial;
	private int numVidasPartida;
	private int menosvidas = numVidasInicial;
	private static int record = 0;

	public Juego(int numeroVidas) {
		this.numVidasInicial = numeroVidas;
		this.numVidasPartida = numeroVidas;
	}

	public void muestraVidasRestantes() {
		System.out.print(this.obtenerVidasRestantes());
	}

	public String obtenerVidasRestantes() {
		return "Vidas restantes: " + this.numVidasPartida;
	}

	public boolean quitaVidas() {

		if (--menosvidas <= 0)
			return false;

		return true;
	}

	public boolean reiniciaPartida() {

		return true;
	}

	public String actualizaRecord() {

		if (record == this.numVidasPartida) {

			return "Se ha alcanzado el record";
		}else if(this.numVidasPartida > record){
			return "Se ha batido el record" + ;
		}
	
	}
	
	public abstract juega(){
		
	}
	
	

}
