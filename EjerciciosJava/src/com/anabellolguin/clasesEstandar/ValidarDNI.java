package com.anabellolguin.clasesEstandar;

public abstract class ValidarDNI {
	
	// la variable se declara final porque no se puede modificar su valor
        private static final char [] LETRA_DNI= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        

				
    public static boolean nifValido(String nif){
    	
    	
         boolean dniCorrecto = true;
         int cont =0;
  
        int parteNumerica=0;
        
       
         if (nif.length()!=9) 
         {
             System.out.println("El numero de digitos de su NIF es incorrecto");
             dniCorrecto= false;
         }
         else {
             while (dniCorrecto && cont < 8)  {
                 if (Character.isDigit(nif.charAt(cont))) ++cont;
                 else {
                     System.out.println("Los numeros de su NIF son incorrectos - ha introducido un caracter en lugar de un numero");
                     dniCorrecto=false;
                 }
              
             }
            
             if (dniCorrecto){
                 parteNumerica = Integer.parseInt(nif.substring(0, 8));
                 if (Character.isLetter(nif.toUpperCase().charAt(8)) && LETRA_DNI[parteNumerica%23]!=nif.toUpperCase().charAt(8)){
                     System.out.println("El caracter de verificacion o su NIF  es incorrecto");
                     dniCorrecto=false;
                 }
             }
                                    
         }
       if (dniCorrecto) {
          System.out.println( " NIF correcto");
          System.out.println( "Numero: " + parteNumerica + " Letra: " + nif.toUpperCase().charAt(8) );
       }
      
       else System.out.println( " NIF erroneo");
	
       return dniCorrecto;
	
      
    
     }
 
    	
   
       
                
  }
        	
		
		

