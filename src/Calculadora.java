/**
 * Calculadora.java 
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de Datos Seccion 10 
 * Hoja de Trabajo 04
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * @author Christopher Sandoval 
 * @since 22 Febrero 2017
 */



public class Calculadora implements iCalculadora {

	private double operacionDivision;
	private double operacionSuma;
	private double operacionResta;
	private double operacionMultiplicacion;
	private iPila<Double> miStack;

	/**
	 * Constructor
	 */
	public Calculadora() {
		FactoryPilas<Double> factoryPilas = new FactoryPilas<Double>();
		miStack = factoryPilas.getPila(1, 0);
	}

	@Override
	// post: recive un string, lo agrega a una pila y traduce la operacion postfix para dar el resultado
	public double operar(String n) {
		double resultado = 0;
		for (int i = 0; i < n.length(); i++) {
			char charito = n.charAt(i);
			// Si es un numero, lo mete a la pila
			if (charito > 47 && charito < 58) {
				miStack.push(Double.parseDouble(charito + ""));
			} else if (charito == 42 || charito == 43 || charito == 45 || charito == 47) {
				// Si es un operando, hace pop de dos elementos y realiza la operacion indicada
				double temporal1 = miStack.pop();
				double temporal2 = miStack.pop();
				switch ((int) charito) {
				case 42:
					resultado = multiplicacion(temporal2, temporal1);
					break;
				case 43:
					resultado = suma(temporal2, temporal1);
					break;
				case 45:
					resultado = resta(temporal2, temporal1);
					break;
				case 47:
					resultado = division(temporal2, temporal1);
					break;
				}
				miStack.push(resultado);
			}
		}
		resultado = miStack.pop();
		return resultado;
	}

	@Override
	public double suma(double a, double b) {
		operacionSuma = a + b;
		return operacionSuma;
	}

	@Override
	public double resta(double a, double b) {
		operacionResta = a - b;
		return operacionResta;
	}

	@Override
	public double multiplicacion(double a, double b) {
		operacionMultiplicacion = a * b;
		return operacionMultiplicacion;
	}

	@Override
	public double division(double a, double b) {
		operacionDivision = a / b;
		return operacionDivision;
	}

}
