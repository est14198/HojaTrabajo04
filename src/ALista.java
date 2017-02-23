/**
 * ALista.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 04
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * @author FER ESTRADA
 * @since 22 Febrero 2017
 */



public abstract class ALista<E> implements iLista<E> {
	
	public ALista() {
	// post: does nothing
	}

	public boolean isEmpty() {
	    // post: returns true iff list has no elements
		return size() == 0;
	}
	  
	public boolean contains(E value) {
	    // pre: value is not null
	    // post: returns true iff list contains an object equal to value
		return -1 != indexOf(value);
	}
	
}