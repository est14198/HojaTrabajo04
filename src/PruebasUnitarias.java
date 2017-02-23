import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Calculadora.java 
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de Datos Seccion 10 
 * Hoja de Trabajo 04
 * Maria Fernanda Estrada 14198
 * @author FER ESTRADA
 * Christopher Sandoval 13660 
 * @since 22 Febrero 2017
 */

//HAY QUE PROBARLOS UNO POR UNO POR LA IMPLEMENTACION DEL PATRON DE DISEÑO SINGLETON <--------------------------------------------------------
//(Si se corren todos al mismo tiempo intenta volver a instanciar la clase calculadora)
public class PruebasUnitarias {

	
	Calculadora calculadora = new Calculadora(0,0);
	
	@Test
	public void ConArrayList() {
		calculadora.cambiarPila(0, 0);
		assertEquals("Operacion con pila ArrayList",calculadora.operar("1 4 + 5 * 6 + 1 + 2 /"),16.0,0.001);
	}
	/*
	@Test
	public void ConVector() {
		calculadora.cambiarPila(1, 0);
		assertEquals("Operacion con pila Vector",calculadora.operar("1 4 + 5 * 6 + 1 + 2 /"),16.0,0.001);
	}
	
	@Test
	public void ConListaSimplementeEncadenada() {
		calculadora.cambiarPila(2, 0);
		assertEquals("Operacion con Lista Simplemente Encadenada",calculadora.operar("1 4 + 5 * 6 + 1 + 2 /"),16.0,0.001);
	}
	
	@Test
	public void ConListaDoblementeEncadenada() {
		calculadora.cambiarPila(2, 1);
		assertEquals("Operacion con Lista Doblemente Encadenada",calculadora.operar("1 4 + 5 * 6 + 1 + 2 /"),16.0,0.001);
	}
	
	@Test
	public void ConListaCircular() {
		calculadora.cambiarPila(2, 2);
		assertEquals("Operacion con Lista Circular",calculadora.operar("1 4 + 5 * 6 + 1 + 2 /"),16.0,0.001);
	}*/
}
