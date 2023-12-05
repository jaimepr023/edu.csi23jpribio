package edu.csi23jpribio.servicios;

import java.util.Scanner;

/**
 * Interfaz donde se encuentra la cabecera de los metodos de operativa
 * @author jpr-5/12/23
 */
public interface OperativaInterfaz {

	/**
	 * Metodo que suma y añade la cantidad que tienes, y esta se guarda constantemente
	 * @author jpr-5/12/23
	 * @param sc para poder pedir la cantidad al usuario
	 * @return
	 */
	public int suma(Scanner sc);
	
	/**
	 *Metodo que resta y quita la cantidad que tienes, y esta se guarda constantemente
	 *@author jpr-5/12/23
	 * @param sc para poder pedir la cantidad al usuario
	 * @return
	 */
	public int resta(Scanner sc);
	}
