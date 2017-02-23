/**
 * ListaSE.java 
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de
 * Datos Seccion 10 Hoja de Trabajo 04 
 * Maria Fernanda Estrada 14198 
 * Christopher Sandoval 13660
 * @author FER ESTRADA
 * @since 22 Febrero 2017
 */



public class ListaSE<E> extends ALista<E> {
	protected int count; // list size
	protected Node<E> head; // ref. to first element

	public ListaSE()
	   // post: generates an empty list
	   {
	      head = null;
	      count = 0;
	   }

	public int size()
	// post: returns number of elements in list
	{
		return count;
	}

	public void addLast(E value)
	// post: adds value to end of list
	{
		// location for new value
		Node<E> temp = new Node<E>(value, null);
		if (head != null) {
			// pointer to possible tail
			Node<E> finger = head;
			while (finger.next() != null) {
				finger = finger.next();
			}

			finger.setNext(temp);
		} else
			head = temp;

		count++; 

	}

	@Override
	public E removeLast() {
		Node<E> temp = head;
		for(int i=1; i<count; i++){
			temp = temp.next();
		}
		Node<E> temp2 = temp.next();
		temp.setNext(null);
		count--;
		return temp2.value();
	}

}