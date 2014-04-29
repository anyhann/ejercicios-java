package com.anabellolguin.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;

import org.junit.Before;
import org.junit.Test;

import com.anabellolguin.clases.Aplication;
import com.anabellolguin.clases.JuegoAdivinaImpar;
import com.anabellolguin.clases.JuegoAdivinaNumero;
import com.anabellolguin.clases.JuegoAdivinaPar;
import com.anabellolguin.interfaces.Jugable;

public class JuegoTest {

	JuegoAdivinaNumero juego1, juego2;
	JuegoAdivinaImpar juegoImpar;
	JuegoAdivinaPar juegoPar;

	@Before
	public void setUp() throws Exception {

		Jugable juego = (Jugable) Aplication.eligeJuego();
		juego1 = new JuegoAdivinaNumero(5);
		juego2 = new JuegoAdivinaNumero(5);
		juegoImpar = new JuegoAdivinaImpar(5);
		juegoPar = new JuegoAdivinaPar(5);
	}
	
	@Test
	public void testJuego() {
		
		/*ByteArrayInputStream in = new ByteArrayInputStream("0".getBytes());
		System.setIn(in);
		
		Jugable juego = (Jugable) Aplication.eligeJuego();
		assertTrue(juego instanceof JuegoAdivinaNumero);
		
		in = new ByteArrayInputStream(null);
		System.setIn(in);*/
		

		//pruebas para Juego
		assertEquals("Juego", 5, juego1.obtenerVidasRestantes());
		assertEquals("Juego", 6, juego2.obtenerVidasRestantes());
		assertEquals("Juego", 5, juego1.obtenerVidasRestantes());
		assertEquals("Juego", 6, juego2.obtenerVidasRestantes());
		juego1.actualizaRecord();
		assertEquals("Juego", 5, juego1.obtenerRecord());
		
		

		assertEquals("Juego", true, juego1.quitaVida());
		assertEquals("Juego", true, juego2.quitaVida());
		assertEquals("Juego", 4, juego1.obtenerVidasRestantes());
		assertEquals("Juego", 5, juego2.obtenerVidasRestantes());

	juego1.actualizaRecord();
	assertEquals("Juego", 4, juego1.obtenerRecord());
	juego2.actualizaRecord();
	assertEquals("Juego", 5, juego2.obtenerRecord());

	juego1.reiniciaPartida();
	juego2.reiniciaPartida();
	assertEquals("Juego", 5, juego1.obtenerVidasRestantes());
	assertEquals("Juego", 6, juego2.obtenerVidasRestantes());

	}
	@Test
	public void testJugable() {

		//pruebas para Jugable

		juego1.muestraInfo();
		juego1.muestraNombre();
		assertEquals("Jugable", "Adivinar numero", juego1.muestraNombre());
		

		//juego par

		assertEquals("JuegoPar", 3, juegoPar.obtenerVidasRestantes());
		assertEquals("JuegoImpar", 3, juegoImpar.obtenerVidasRestantes());

		assertTrue(juegoPar.validaNumero(4));
		assertFalse(juegoPar.validaNumero(3));
		assertTrue(juegoImpar.validaNumero(3));
		assertFalse(juegoImpar.validaNumero(4));
		assertEquals("JuegoPar", "Juego Adivina Par", juegoPar.muestraNombre());
		assertEquals("JuegoImpar", "Juego Adivina Impar", juegoImpar.muestraNombre());


	}


}
