package edu.csi23jpribio.servicios;

/**
 * Interfaz con las cabeceras de los metodos que muestra por pantalla si esta su resta en 0 o en numero negativos
 * @author jpr-5/12/23
 */
public interface CondicionInterfaz {
	
	/**
	 * Metodo que escribe por pantalla si hemos llegao a numero negativos o 0
	 * @author jpr-5/12/23
	 * @param total cantidad total de las rentas 
	 */
	public void condicionNum(int total);
	
	/**
	 * Metodo que nos dice como vamos segun nuestras rentas 
	 * @author jpr-5/12/23
	 * @param total cantidad total de las rentas 
	 */
	public void condicionMostrar(int total);

}
