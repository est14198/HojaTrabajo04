/**
 * iCalculadora.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 02
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * @author clase
 * @since 6 Enero 2017
 */



public interface iCalculadora {
	
	/**
	 * @param n es la cadena de texto leida del archivo
	 * @return el resultado de la operacion
	 */
	public double operar (String n);
	// post: recive un string, lo agrega a una pila y traduce la operacion postfix para dar el resultado
	
	/**
	 * @param a el primer numero a operar
	 * @param b el segundo numero a operar
	 * @return resultado de sumar los dos numeros
	 */
	public double suma (double a, double b);
	// post: suma dos elementos y regresa el resultado
	
	/**
	 * @param a el primer numero a operar
	 * @param b el segundo numero a operar
	 * @return resultado de restar los dos numeros
	 */
	public double resta (double a, double b);
	// post: resta dos elementos y regresa el resultado
	
	/**
	 * @param a el primer numero a operar
	 * @param b el segundo numero a operar
	 * @return resultado de multiplicar los dos numeros
	 */
	public double multiplicacion (double a, double b);
	// post: multiplica dos elementos y regresa el resultado
	
	/**
	 * @param a el primer numero a operar
	 * @param b el segundo numero a operar
	 * @return resultado de dividir dos numeros
	 */
	public double division (double a, double b);
	// post: divide dos elementos y regresa el resultado

}