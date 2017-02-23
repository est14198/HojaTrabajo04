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
	
	// post: regresa el numero de elementos en la lista
	public int size();
	
	// post: regresa true si la lista no tiene elementos
	public boolean isEmpty();
	
	// post: el valor es agregado al inicio de la lista
	public void addFirst(E value);
	
	// post: el valor es agregado al final de la lista
	public void addLast(E value);
	
	// pre: la lista no esta vacia
	// post: regresa el primer valor en la lista
	public E getFirst();
	
	// pre: la lista no esta vacia
	// post: regresa el ultimo elemento de la lista
	public E getLast();
	
	// pre: la lista no esta vacia
	// post: elimina el primer valor de la lista
	public E removeFirst();
	
	// pre: la lista no esta vacia
	// post: elimina el ultimo valor de la lista
	public E removeLast();
	
}