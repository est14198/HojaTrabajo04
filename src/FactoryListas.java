/**
 * FactoryListas.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 04
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * @author FER ESTRADA
 * @param <E>
 * @since 22 Febrero 2017
 */


// Regresa una instancia de ListaSE, Lista DE o ListaC dependiendo de la opcion que ingrese el usuario
public class FactoryListas<E> {
	
	public FactoryListas(){
		
	}
	
	/**
	 * @param tipoLista
	 * @return lista
	 */
	public iLista<E> getLista (int tipoLista) {
		switch (tipoLista) {
		case 0:
			return new ListaSE<E>();
		case 1:
			return new ListaDE<E>();
		case 2:
			return new ListaC<E>();
		default:
			return null;
		}
		
	}

}
