/**
 * ListaC.java 
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de
 * Datos Seccion 10 Hoja de Trabajo 04 
 * Maria Fernanda Estrada 14198 
 * Christopher Sandoval 13660
 * @author FER ESTRADA
 * @since 22 Febrero 2017
 */



public class ListaC<E> extends ALista<E> {
	protected Node<E> tail; 
	protected int count;

	public ListaC()
	// pre: constructs a new circular list
	{
	   tail = null;
	   count = 0;
	}
	
	public int size()
	// post: returns number of elements in list
	{
		return count;
	}

	public void addFirst(E value)
	// pre: value non-null
	// post: adds element to head of list
	{
	   Node<E> temp = new Node<E>(value);
	   if (tail == null) { // first value added
	       tail = temp;
	       tail.setNext(tail);
	   } else { // element exists in list
	       temp.setNext(tail.next());
	       tail.setNext(temp);
	   }
	   count++;
	}


	public void addLast(E value)
	// pre: value non-null
	// post: adds element to tail of list
	{
	   // new entry:
	   addFirst(value);
	   tail = tail.next();
	}


	// lo dificil es quitar el elemento de la cola

	public E removeLast()
	// pre: !isEmpty()
	// post: returns and removes value from tail of list
	{
	   Node<E> finger = tail;
	   while (finger.next() != tail) {
	       finger = finger.next();
	   }
	   // finger now points to second-to-last value
	   Node<E> temp = tail;
	   if (finger == tail)
	   {
	       tail = null;
	   } else {
	       finger.setNext(tail.next());
	       tail = finger;
	   }
	   count--;
	   return temp.value();
	}
}
