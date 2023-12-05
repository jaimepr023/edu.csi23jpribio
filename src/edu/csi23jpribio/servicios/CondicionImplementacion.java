package edu.csi23jpribio.servicios;

/**
 * Implementacion que implementa la interfaz de las condiciones
 * @author jpr-5/12/23
 */
public class CondicionImplementacion implements CondicionInterfaz {

	@Override
	public void condicionNum(int total) {

		if (total==0) {
			System.out.println("Su renta ha llegado a 0.");
		}else if(total<0) {
			System.out.println("Su renta ha llegado a numero negativos, debes usted dinero.");
		}
	}

	@Override
	public void condicionMostrar(int total) {
		if(total==0) {
			System.out.println("Vamos mal. " + total);
		}else if(total<0) {
			System.out.println("Vamos muy mal. " + total);
		}
		
	}

}
