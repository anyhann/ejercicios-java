package com.anabellolguin.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.anabellolguin.juego.Juego;

public class JuegoTest {
	Juego jue;

	@Before
	public void setUp() throws Exception {
		
		 jue = new Juego(3);
	}

	@Test
	public void test1() {
		assertEquals("Juego 1", "Vidas restantes: 3", jue.obtenerVidasRestantes());
	
	}
	
	
	
	

	

}
