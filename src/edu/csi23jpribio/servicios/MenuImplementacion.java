package edu.csi23jpribio.servicios;

import java.util.Scanner;

/**
 * Implementacion que implementa la interfaz de la interaccion con el usuario (toda la logica)
 * @author jpr-5/12/23
 */
public class MenuImplementacion implements MenuInterfaz {

	@Override
	public void mensajeBienvenida() {
		System.out.println("Elija la opcion que quieras realizar.");
		
	}

	@Override
	public int menu(Scanner sc) {
		int opcion;
		System.out.println("--------------------------");
		System.out.println("Opcion 0. Cerrar menu");
		System.out.println("Opcion 1. Añadir venta.");
		System.out.println("Opcion 2. Añadir gasto.");
		System.out.println("Opcion 3. Mostrar total");
		System.out.println("--------------------------");
		opcion= sc.nextInt();
		return opcion;
	}

}
