import java.util.ArrayList;

/**
 * APila.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 04
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * @author Christopher Sandoval
 * @since 22 Febrero 2017
 */



public abstract class APila<E> implements iPila<E> {
	
	protected ArrayList<E> data;
	
	// post: regresa true si la pila se encuentra vacia
	public boolean isEmpty() {
		return data.size() == 0;
	}

}
