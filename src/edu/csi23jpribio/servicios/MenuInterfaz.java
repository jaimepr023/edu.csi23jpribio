package edu.csi23jpribio.servicios;

import java.util.Scanner;

/**
 * Interfaz donde se encuentra la cabecera de los metodos en relacion con la interaccion del usuario
 * @author jpr-5/12/23
 */
public interface MenuInterfaz {
	
	/**
	 * Metodo que muestra el mensaje de bienvenida por pantalla
	 * @author jpr-5/12/23
	 */
	public void mensajeBienvenida();

	/**
	 * Metodo que muestra el menu en pantalla y pide al usuario que recoja una opcion
	 * @author jpr-5/12/23
	 * @param sc para poder pedir un valor al usuario
	 * @return
	 */
	public int menu(Scanner sc);
}
