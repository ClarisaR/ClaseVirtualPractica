package claseVirtual;

import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
		Cuenta cuentaUno = new Cuenta();
		Cuenta cuentaDos = new Cuenta();
		Cuenta cuentaSeleccionada = null;
		Scanner teclado = new Scanner(System.in);
		
		mensajeDeBienvenida();
		
		cuentaSeleccionada = pedirCuenta(cuentaUno, cuentaDos, cuentaSeleccionada, teclado);

		char opcionSeleccionada;
		do {
			mostrarOperacionesSobreCuenta();
			opcionSeleccionada = operarSobreCuenta(cuentaSeleccionada, teclado);
		} while (opcionSeleccionada != 'd');
	}

	private static Cuenta pedirCuenta(Cuenta cuentaUno, Cuenta cuentaDos, Cuenta cuentaSeleccionada, Scanner teclado) {
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
			default: {
				mostrarMensajeDeError("No existe este numero de cuenta");
			}

			}
		} while (opcionCuenta != 1 && opcionCuenta != 2);
		return cuentaSeleccionada;
	}

	private static void mensajeDeBienvenida() {
		System.out.println("*******************************");
		System.out.println("BIENVENIDO AL CAJERO AUTOMATICO");
		System.out.println("*******************************");
	}

	private static char operarSobreCuenta(Cuenta cuentaSeleccionada, Scanner teclado) {
		char opcion = teclado.next().toLowerCase().charAt(0);
		switch (opcion) {
			case Cuenta.DEPOSITAR: {
				depositar(cuentaSeleccionada, teclado);
				break;
			}
			case Cuenta.EXTRAER: {
				extraer(cuentaSeleccionada, teclado);
				break;
			}
			case Cuenta.VER_SALDO: {
				mostrarSaldo(cuentaSeleccionada);
				break;
			}
			case Cuenta.SALIR: {
				finalizarOperacion();
				break;
			}
			default: {
				mostrarMensajeDeError("No existe la opcion ingresada");
			}
		}
		return opcion;
	}

	private static void mostrarMensajeDeError(String mensaje) {
		System.out.println(mensaje);
	}

	private static void finalizarOperacion() {
		System.out.println("*******************************");
		System.out.println("OPERACION FINALIZADA");
		System.out.println("*******************************");
	}

	private static void mostrarSaldo(Cuenta cuentaSeleccionada) {
		System.out.println("Saldo: $" + cuentaSeleccionada.getSaldo());
	}

	private static void extraer(Cuenta cuentaSeleccionada, Scanner teclado) {
		System.out.println("Extraer: ");
		double extraccion = teclado.nextDouble();
		if (cuentaSeleccionada.getSaldo() >= extraccion) {
			cuentaSeleccionada.extraer(extraccion);
			System.out.println("Extraiste: $" + extraccion);
		} else {
			System.out.println("No se pudo extraer.");
		}
	}

	private static void depositar(Cuenta cuentaSeleccionada, Scanner teclado) {
		System.out.println("Deposito: ");
		double deposito = teclado.nextDouble();
		cuentaSeleccionada.depositar(deposito);
	}

	private static void mostrarOperacionesSobreCuenta() {
		System.out.println("Que operacion desea realizar?");
		System.out.println("a-Depositar en cuenta");
		System.out.println("b-Extraer saldo de la cuenta");
		System.out.println("c-Ver saldo de la cuenta");
		System.out.println("d-Salir");
	}
}