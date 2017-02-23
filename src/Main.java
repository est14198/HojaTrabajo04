import java.util.Scanner;

/**
 * Main.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 04
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * @author FER ESTRADA
 * @since 22 Febrero 2017
 */



public class Main {

    private static String datos;

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	// Leer los datos del archivo
    	
    	Leer dats = new Leer ();
    	datos = dats.textoLeer();
    	System.out.println("String Leido: "+datos+"\n");
    	
    	
    	iCalculadora miCalcu;
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Seleccione que implementacion desea para el stack:\n1. ArrayList\n2. Vector\n3. Lista");

    	int seleccion = 0;
    	boolean loop=true; 
    	while(loop){
	    	try{
	    		seleccion = scanner.nextInt();
	    		if(seleccion>0 && seleccion<4){
	    			loop = false;
	    		}else{
	    			System.out.println("La opcion seleccionada no es valida");
	    		}
	    	}catch(Exception e){
	    		System.out.println("La opcion seleccionada no es valida");
	    	}
    	}
    	
		switch (seleccion) {
		case 1:
			miCalcu = new Calculadora(0, 0);
			break;
		case 2:
			miCalcu = new Calculadora(1, 0);
			break;
		case 3:
			System.out.println("Seleccione que implementacion desea para la Lista:\n1. Simplemente Encadenada\n2. Doblemente Encadenada\n3. Circular");
	    	int seleccion2 = 0;
	    	boolean loop2=true; 
	    	while(loop2){
		    	try{
		    		seleccion2 = scanner.nextInt();
		    		if(seleccion2>0 && seleccion2<4){
		    			loop2 = false;
		    		}else{
		    			System.out.println("La opcion seleccionada no es valida");
		    		}
		    	}catch(Exception e){
		    		System.out.println("La opcion seleccionada no es valida");
		    	}
	    	}
	    	
	    	switch (seleccion2) {
			case 1:
				miCalcu = new Calculadora(2, 0);
				break;
			case 2:
				miCalcu = new Calculadora(2, 1);
				break;
			case 3:
				miCalcu = new Calculadora(2, 2);
				break;
			default:
				miCalcu = new Calculadora(2, 0);
				break;
	    	}
			break;
		default:
			miCalcu = new Calculadora(0, 0);
			break;
		}
		
    	// Imprimir resultado
    	System.out.println("\nResultado: " + miCalcu.operar(datos));
    	scanner.close();
    }
    
}
