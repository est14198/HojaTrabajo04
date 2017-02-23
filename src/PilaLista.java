/**
 * PilaVector.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 04
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * @author Christopher Sandoval
 * @since 22 Febrero 2017
 */

public class PilaLista<E> implements iPila<E> {

	protected iLista<E> data;
	
	public PilaLista(int tipoLista){
		FactoryListas<E> factoryListas = new FactoryListas<E>();
		data = factoryListas.getLista(tipoLista);
	}

	@Override
	public E pop() {
		return data.removeLast();
	}

	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}

	@Override
	public void push(E algo) {
		data.addLast(algo);
	}

}
