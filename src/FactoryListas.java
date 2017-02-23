/**
 * FactoryListas.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 04
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * @author FER ESTRADA
 * @since 22 Febrero 2017
 */


// Regresa una instancia de ListaSE, Lista DE o ListaC dependiendo de la opcion que ingrese el usuario
public class FactoryListas {
	
	public iLista<Double> getLista (int tipoLista) {
		switch (tipoLista) {
		case 0:
			return new ListaSE<Double>();
		case 1:
			return new ListaDE<Double>();
		case 2:
			return new ListaC<Double>();
		default:
			return null;
		}
		
	}

}
