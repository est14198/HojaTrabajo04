import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Calculadora.java 
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de Datos Seccion 10 
 * Hoja de Trabajo 02 
 * Maria Fernanda Estrada 14198
 * @author FER ESTRADA
 * Christopher Sandoval 13660 
 * @since 6 Enero 2017
 */

public class PruebasUnitarias {

	@Test
	public void division() {
		iCalculadora calculadora = new Calculadora();
		assertEquals("Division de 10/2",calculadora.division(10, 2),5,0.001);
	}
	
	@Test
	public void multiplicacion() {
		iCalculadora calculadora = new Calculadora();
		assertEquals("Multiplicacion de 10*2",calculadora.multiplicacion(10, 2),20,0.001);
	}
	
	@Test
	public void suma() {
		iCalculadora calculadora = new Calculadora();
		assertEquals("Suma de 10+2",calculadora.suma(10, 2),12,0.001);
	}
	
	@Test
	public void resta() {
		iCalculadora calculadora = new Calculadora();
		assertEquals("Resta de 10-2",calculadora.resta(10, 2),8,0.001);
	}
	
	@Test
	public void operacionBasica() {
		iCalculadora calculadora = new Calculadora();
		assertEquals("Operacion: 1 1 +",calculadora.operar(" 1 1 +"),2,0.001);
	}
	
	@Test
	public void push() {
		iPila<Double> pila = new PilaVector<Double>(1);
		pila.push(2.0);
		assertEquals("Push de un numero", pila.isEmpty(),false);
	}
	
	@Test
	public void pop() {
		iPila<Double> pila = new PilaVector<Double>(1);
		pila.push(2.0);
		assertEquals("Pop de un numero", pila.pop(),2.0,0.001);
	}
	
	@Test
	public void isEmpty() {
		iPila<Double> pila = new PilaVector<Double>(1);
		pila.push(2.0);
		pila.push(3.0);
		assertEquals("Verificar si esta vacio", pila.isEmpty(),false);
	}

	
}
