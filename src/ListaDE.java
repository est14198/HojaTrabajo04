/**
 * ListaDE.java 
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de
 * Datos Seccion 10 Hoja de Trabajo 04 
 * Maria Fernanda Estrada 14198 
 * Christopher Sandoval 13660
 * @author FER ESTRADA
 * @since 22 Febrero 2017
 */



public class ListaDE<E> extends ALista<E> {
	protected int count;
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tail;

	public ListaDE()
	// post: constructs an empty list
	{
	   head = null;
	   tail = null;
	   count = 0;
	}
	
	public int size()
	// post: returns number of elements in list
	{
		return count;
	}

	public void addLast(E value)
	// pre: value is not null
	// post: adds new value to tail of list
	{
		// construct new element
		tail = new DoublyLinkedNode<E>(value, null, tail);
		// fix up head
		if (head == null)
			head = tail;
		count++;
	}

	public E removeLast()
	// pre: list is not empty
	// post: removes value from tail of list
	{
		DoublyLinkedNode<E> temp = tail;
		tail = tail.previous();
		if (tail == null) {
			head = null;
		} else {
			tail.setNext(null);
		}
		count--;
		return temp.value();
	}
}
