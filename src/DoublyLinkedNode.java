/**
 * DoublyLinkedNode.java 
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de
 * Datos Seccion 10 Hoja de Trabajo 04 
 * Maria Fernanda Estrada 14198 
 * Christopher Sandoval 13660
 * @author FER ESTRADA
 * @since 22 Febrero 2017
 */



public class DoublyLinkedNode<E> {

	protected E data;
	protected DoublyLinkedNode<E> nextElement;
	protected DoublyLinkedNode<E> previousElement;

	/**
	 * @param v
	 * @param next
	 * @param previous
	 */
	public DoublyLinkedNode(E v, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous) {
		data = v;
		nextElement = next;
		if (nextElement != null)
			nextElement.previousElement = this;
		previousElement = previous;
		if (previousElement != null)
			previousElement.nextElement = this;
	}

	/**
	 * @param v
	 */
	public DoublyLinkedNode(E v)
	// post: constructs a single element
	{
		this(v, null, null);
	}
	
	/**
	 * @return pasado
	 */
	public DoublyLinkedNode<E> previous(){
		return previousElement;
	}
	
	/**
	 * @param next
	 */
	public void setNext(DoublyLinkedNode<E> next){
		nextElement = next;
	}
	
	/**
	 * @return valor
	 */
	public E value(){
		return data;
	}
}