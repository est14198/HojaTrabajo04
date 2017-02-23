/**
 * Leer.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 04
 * Maria Fernanda Estrada 14198
 * @author FER ESTRADA
 * Christopher Sandoval 13660
 * @since 22 Febrero 2017
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Leer {
	private BufferedReader bf;

	public Leer() {

	}

	// Clase para leer archivos de texto
	/*
	 * public String textoLeer(String textoArchivo){
	 * 
	 * String texto = ""; try { bf = new BufferedReader(new
	 * FileReader(textoArchivo)); String varTemporal = ""; String bfRead;
	 * 
	 * while ((bfRead = bf.readLine()) !=null) { varTemporal = varTemporal +
	 * bfRead; } texto = varTemporal;
	 * 
	 * } catch(Exception e) { System.out.println("VACIO"); }
	 * 
	 * return texto; }
	 */
	public String textoLeer() {
		File file;
		file = new File("datos.txt");

		String texto = "";

		try {
			bf = new BufferedReader(new FileReader(file));
			String varTemporal = "";
			String bfRead;

			while ((bfRead = bf.readLine()) != null) {
				varTemporal = varTemporal + bfRead;
			}
			texto = varTemporal;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("VACIO");
		}

		return texto;
	}
}