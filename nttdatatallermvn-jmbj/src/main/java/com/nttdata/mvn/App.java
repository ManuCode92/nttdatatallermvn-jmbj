package com.nttdata.mvn;

import org.apache.commons.lang3.StringUtils;

/**
 * Clase principal de la api App
 * 
 * @author jmbj
 *
 */
public class App {

	/**
	 * Método principal de la clase.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// El mensaje que mostrara.
		final String message = "Mi primer taller con nttdata Bootcamp Noviembre";
		sayHello(message);
	}

	/**
	 * Método para saludar.
	 * Donde se comprueba si el String que se le paso.
	 * No está vacío, nulo o solo contiene espacios en blanco.
	 * @param msg
	 */
	public static void sayHello(final String msg) {

		String error = "Error";

		
		// Validamos que el mensaje no está vacío.
		if (StringUtils.isNoneBlank(msg)) {

			// Muestra el mensaje
			System.out.println(msg);
		} else {
			// Muestra el error
			System.out.println(error);
		}
	}
}
