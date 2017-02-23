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

	public void addFirst(E value)
	// pre: value is not null
	// post: adds element to head of list
	{
		// construct a new element, making it head
		head = new DoublyLinkedNode<E>(value, head, null);
		// fix tail, if necessary
		if (tail == null)
			tail = head;
		count++;
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

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}
}
