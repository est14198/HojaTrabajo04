/**
 * PilaArrayList.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 04
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * @author Christopher Sandoval
 * @since 22 Febrero 2017
 */



import java.util.ArrayList;


public class PilaArrayList<E> extends APila<E> {
	
	protected ArrayList<E> data;
	
	// post: inicia una pila nueva y vacia
	public PilaArrayList()	{
		data = new ArrayList<E>();	
	}

	@Override
	// post: elemento E se agrega a la pila
	public void push(E algo) {
		data.add(algo);
	}

	@Override
	// pre: la pila no esta vacia
	// post: se elimina el ultimo elemento de la pila y se regresa su valor
	public E pop() {
		return data.remove(data.size()-1);
	}
	
}