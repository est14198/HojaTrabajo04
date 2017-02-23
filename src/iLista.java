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
	public int size();
	// post: returns number of elements in list

	public boolean isEmpty();
	// post: returns true iff list has no elements

	public void addFirst(E value);
	// post: value is added to beginning of list

	public void addLast(E value);
	// post: value is added to end of list

	public E getFirst();
	// pre: list is not empty
	// post: returns first value in list

	public E getLast();
	// pre: list is not empty
	// post: returns last value in list

	public E removeFirst();
	// pre: list is not empty
	// post: removes first value from list

	public E removeLast();
	// pre: list is not empty
	// post: removes last value from list

	public boolean contains(E value);
	// pre: value is not null
	// post: returns true iff list contains an object equal to value

	public int indexOf(E value);
	// pre: value is not null
	// post: returns (0-origin) index of value,
	// or -1 if value is not found
}