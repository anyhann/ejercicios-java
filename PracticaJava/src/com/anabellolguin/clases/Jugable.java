package com.anabellolguin.clases;

public interface Jugable {
	
	public abstract void juega();
	
	public void muestraVidasRestantes();

	public int obtenerVidasRestantes();

	public boolean quitaVida();

	public void reiniciaPartida();

	public void actualizaRecord();

	public String muestraNombre();

	public void muestraInfo();

}
