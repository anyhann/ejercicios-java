package com.anabellolguin.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] miArray = new int[5];
		int max, min;
		
		
		max = Integer.MIN_VALUE;
	
		int x = (int) (100 * Math.random() + 1);
		for(int i=0; i < miArray.length; i++){
			
			if(miArray[i] > max)
				max = miArray[i];
			
		}
		
		System.out.print("El maximo es:" + max);
		
		min  = Integer.MAX_VALUE;
		//calcula el maximo
		
		for(int i=0; i < miArray.length; i++){
			
			if(miArray[i] > min)
				min = miArray[i];
			
		}
		System.out.print("El minimo es:" + min);
		
		Arrays.sort(miArray);
		//falta completar el codigo
		
		

	}

}
