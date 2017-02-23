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

public class FactoryPilas<E> {
	public FactoryPilas(){
	}
	
	public iPila<E> getPila(int tipoPila, int tipoLista){
		switch(tipoPila){
		case 0:
			return new PilaArrayList<E>();
		case 1:
			return new PilaVector<E>(2);
		case 2:
			return new PilaLista<E>(tipoLista);
		default:
			return null;
		}
	}
}
