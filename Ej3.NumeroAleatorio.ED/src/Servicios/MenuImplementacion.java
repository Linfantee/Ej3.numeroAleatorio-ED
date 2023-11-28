package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{
	
	
	public int numeroaleatorio() {
		
		int numero;
		double numeroDouble=Math.random()*100;
		numero=(int)numeroDouble;
		if(numero == 0) {
			numero =1;
		}
		return numero;
		
		
	}
	
    public boolean respuesta(int numeroAdivinar) {
    	Scanner aka = new Scanner(System.in);
    	Boolean valor;
    	System.out.println("Intenta adivinar el número para conseguir una recompensa:");
        int respuesta = aka.nextInt();
    	if(respuesta == numeroAdivinar) {
      		System.out.println("Felicidades has acertado");
    		valor = true;
    	}else if(respuesta < numeroAdivinar) {
    		System.out.println("El número es mayor al introducido");
    	}else {
      		System.out.println("El número es menor al introducido");
    	}
    		
    	
    	return false;
    	
    	
    }
}
