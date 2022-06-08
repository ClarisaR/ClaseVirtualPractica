package claseVirtual;

import claseVirtual.OperacionEnCuenta;
import java.util.Scanner;

public class PruebaCuenta {


	public static void main(String[] args) {
		Cuenta cuentaUno = new Cuenta();
		Cuenta cuentaDos = new Cuenta();
		Cuenta cuentaSeleccionada;

		Scanner teclado = new Scanner(System.in);

		int opcionCuenta;

		do {
			System.out.println("A que cuenta desea ingresar?");
			System.out.println("1/2");
			opcionCuenta = teclado.nextInt();
			switch (opcionCuenta) {
			case 1: {
				cuentaSeleccionada = cuentaUno;
				break;
			}
			case 2: {
				cuentaSeleccionada = cuentaDos;
				break;
			}
				
			}
		} while (opcionCuenta != 1 && opcionCuenta != 2);

		OperacionEnCuenta operacionEnCuenta; 
		char opcion = teclado.next().charAt(0);
		switch (opcion) {
			case 'a': {
				operacionEnCuenta = OperacionEnCuenta.DEPOSITAR_EN_CUENTA;
				break;
			}
			case 'b': {
				operacionEnCuenta = OperacionEnCuenta.EXTRAER_SALDO_DE_LA_CUENTA;
				break;
			}
			case 'c': {
				operacionEnCuenta = OperacionEnCuenta.VER_SALDO_DE_LA_CUENTA;
				break;
			}
			case 'd': {
				operacionEnCuenta = OperacionEnCuenta.SALIR;
				break;
			}
			default: {
				System.out.println("Opcion invalida");
			}
		}
		
		
			System.out.println("Que operacion desea realizar?");
			System.out.println("a-Depositar en cuenta");
			System.out.println("b-Extraer saldo de la cuenta");
			System.out.println("c-Ver saldo de la cuenta");
			System.out.println("d-Salir");

	}


}
