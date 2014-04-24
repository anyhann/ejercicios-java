package com.anabellolguin.fizzbuzz;

public class FizzBuzz {

	public String calcular(int num) {

		String cadena;
		cadena = "";
		for (int i = 0; i <= num; i++) {
			if (i == 1) {
				cadena += Integer.toString(i);
			} else if (i % 15 == 0) {
				cadena += "FizzBuzz";
			} else if (i % 3 == 0) {
				cadena += "Fizz";
			} else if (i % 5 == 0) {
				cadena += "Buzz";
			} else {

				cadena += " " + Integer.toString(i);
			}

		}

		return cadena;

	}

}
