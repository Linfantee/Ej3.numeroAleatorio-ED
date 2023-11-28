package Controladores;


import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;

public class inicio{

	public static void main(String[] args) {
		
	
		
		MenuInterfaz ao = new MenuImplementacion();
	
		int numeroAdivinar= ao.numeroaleatorio();
		System.out.println(numeroAdivinar);
	
	    Boolean valor = false;
	    int i;
	    for(i = 1; 1<=10;i++) {
	    	valor = ao.respuesta(numeroAdivinar);
	    	if(valor) {
	    		break;
	    	}
	    	if(i > 10) {
		    	System.out.println("Número de intentos agotados has perdido");
		    }

	    }
	   
	    
			
		
		
	}
}