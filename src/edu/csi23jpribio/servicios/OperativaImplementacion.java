package edu.csi23jpribio.servicios;

import java.util.Scanner;

/**
 * Implementacion que implementa la interfaz de operativas 
 * @author jpr-5/12/23
 */
public class OperativaImplementacion  implements OperativaInterfaz{


	public int suma(Scanner sc) {
		int suma=0;
		System.out.println("Dame la cantidad que quieres añadir:");
		int cantidad = sc.nextInt();
		
		suma +=cantidad;
		
		return suma;
	}

	@Override
	public int resta(Scanner sc) {
		int resta=0;
		System.out.println("Dame la cantidad que quieres quitar:");
		int cantidad = sc.nextInt();
		
		resta +=cantidad;
		
		return resta;
	}

}
