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
	}

	// post: regresa true si la lista no tiene elementos
	public boolean isEmpty() {
		return size() == 0;
	}

}