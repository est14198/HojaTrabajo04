/**
 * iPila.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 04
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * @author Christopher Sandoval
 * @since 22 Febrero 2017
 */



/**
 * @param <E> es generico para utilizar cualquier tipo de dato
 */
public interface iPila<E> {
	
	/**
	 * @param se recibe un generico y lo ingresa a la pila
	 */
	public void push (E algo);
	// post: elemento E se agrega a la pila
	
	/**
	 * @return retira el ultimo en entrar a la pila y lo regresa
	 */
	public E pop();
	// pre: la pila no esta vacia
	// post: se elimina el ultimo elemento de la pila y se regresa su valor
	
	/**
	 * @return regresa true si la lista esta vacia
	 */
	public boolean isEmpty();
	// post: regresa true si la pila se encuentra vacia

}
