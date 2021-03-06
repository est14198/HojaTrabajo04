/**
 * iLista.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 04
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * @author FER ESTRADA
 * @since 22 Febrero 2017
 */



/**
 * @param <E> es generico para utilizar cualquier tipo de dato
 */
public interface iLista <E> {
	/**
	 * @return tamano
	 */
	public int size();
	// post: returns number of elements in list

	/**
	 * @return si esta vacia
	 */
	public boolean isEmpty();
	// post: returns true iff list has no elements

	/**
	 * @param value agregar el ultimo
	 */
	public void addLast(E value);
	// post: value is added to end of list

	/**
	 * @return quitar ultimo
	 */
	public E removeLast();
	// pre: list is not empty
	// post: removes last value from list
}