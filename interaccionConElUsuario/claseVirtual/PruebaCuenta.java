package claseVirtual;

import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
		Cuenta cuentaUno = new Cuenta();
		Cuenta cuentaDos = new Cuenta();
		Cuenta cuentaSeleccionada = null;

		Scanner teclado = new Scanner(System.in);

		int opcionCuenta;
		System.out.println("*******************************");
		System.out.println("BIENVENIDO AL CAJERO AUTOMATICO");
		System.out.println("*******************************");

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
			default: {
				System.out.println("No existe este numero de cuenta");
			}

			}
		} while (opcionCuenta != 1 && opcionCuenta != 2);

		char opcion;

		do {
			menuCuenta();
			opcion = teclado.next().toLowerCase().charAt(0);
			operacion(cuentaSeleccionada, teclado, opcion);
		} while (opcion != 'd');
	}

	// Metodo operacion
	private static void operacion(Cuenta cuentaSeleccionada, Scanner teclado,
			char opcion) {
		switch (opcion) {
			case 'a': {
				System.out.println("Deposito: ");
				double deposito = teclado.nextDouble();
				cuentaSeleccionada.depositar(deposito);
				break;
			}
			case 'b': {
				System.out.println("Extraer: ");
				double extraccion = teclado.nextDouble();
				if (cuentaSeleccionada.getSaldo() >= extraccion) {
					cuentaSeleccionada.extraer(extraccion);
					System.out.println("Extraiste: $" + extraccion);
				} else {
					System.out.println("No se pudo extraer.");
				}
				break;
			}
			case 'c': {
				System.out.println("Saldo: $" + cuentaSeleccionada.getSaldo());
				break;
			}
			case 'd': {
				System.out.println("OPERACION FINALIZADA");
				System.out.println("*******************************");
			}
		}
	}

	// Metodo menuCuenta
	private static void menuCuenta() {
		System.out.println("Que operacion desea realizar?");
		System.out.println("a-Depositar en cuenta");
		System.out.println("b-Extraer saldo de la cuenta");
		System.out.println("c-Ver saldo de la cuenta");
		System.out.println("d-Salir");
	}
}