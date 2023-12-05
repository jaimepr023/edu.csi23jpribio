package edu.csi23jpribio.controladores;

import java.util.Scanner;

import edu.csi23jpribio.servicios.CondicionImplementacion;
import edu.csi23jpribio.servicios.CondicionInterfaz;
import edu.csi23jpribio.servicios.MenuImplementacion;
import edu.csi23jpribio.servicios.MenuInterfaz;
import edu.csi23jpribio.servicios.OperativaImplementacion;
import edu.csi23jpribio.servicios.OperativaInterfaz;

/**
 * Clase inicial donde se encuentra el procedimiento de nuestra aplicacion
 * @author jpr-5/12/23 
 */
public class inicioApp {

	/**
	 * Metodo main donde se encuentra lo principal(es nuestro metodo principal)
	 * @author jpr-5/12/23
	 * @param args
	 */
	public static void main(String[] args) {
		
		int total = 0;
		Scanner sc = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz op = new OperativaImplementacion();
		CondicionInterfaz ci = new CondicionImplementacion();
		mi.mensajeBienvenida();
		
		boolean cerrarMenu=false;
		int opcion;
		
		while(!cerrarMenu) {
			
			opcion=mi.menu(sc);
			switch(opcion) {
			case 0:
				System.out.println("[INFOS]-Ahora se ejecutara la funcion de cerrar menu.");
				cerrarMenu=true;
				break;
			case 1:
				System.out.println("[INFOS]-Ahora se ejecutara la funcion de añadir una venta.");
				total+=op.suma(sc);
				break;
			case 2:
				System.out.println("[INFOS]-Ahora se ejecutara la funcion de añadir un gasto.");
				total-=op.resta(sc);
				ci.condicionNum(total);
				break;
			case 3: 
				System.out.println("[INFOS]-Ahora se ejecutara la funcion de mostrar las rentas.");
				ci.condicionMostrar(total);
				break;
			default:
				System.out.println("[INFOS]-No has elegido ninguna opcion, vuelva a intentarlo por favor.");
				break;
			}
		}
		
	}

}
