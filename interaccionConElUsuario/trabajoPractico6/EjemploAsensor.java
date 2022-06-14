package trabajoPractico6;

import java.util.Scanner;

import trabajoPractico3.Persona;

public class EjemploAsensor {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Asensor asensorEdificio = new Asensor(6, 500);

		Persona clarisa = new Persona(55.0);
		asensorEdificio.ingresar(clarisa);
		
		mensajeDeBienvenida();
		
		char opcionSeleccionada = ' ';
		
		do {
			mostrarOperacionesSobreAsensor();
			opcionSeleccionada = operarSobreAsensor(teclado, asensorEdificio);
		}while(opcionSeleccionada=='a'||opcionSeleccionada=='b'||opcionSeleccionada=='c'||opcionSeleccionada=='d'||opcionSeleccionada=='e'||opcionSeleccionada=='f');
		
		asensorEdificio.salir(clarisa);
	}

	private static char operarSobreAsensor(Scanner teclado, Asensor asensorEdificio) {
		char opcion = teclado.next().toLowerCase().charAt(0);
		switch (opcion) {
		case Asensor.ABRIR_PUERTA: {
			abrirPuerta(asensorEdificio);
			break;
		}
		case Asensor.CERRAR_PUERTA: {
			cerrarPuerta(asensorEdificio);
			break;
		}
		case Asensor.SUBIR: {
			subir(asensorEdificio);
			break;
		}
		case Asensor.BAJAR: {
			bajar(asensorEdificio);
			break;
		}
		case Asensor.IR_AL_PISO: {
			irAlPiso(teclado, asensorEdificio);
			break;
		}
		case Asensor.PISO_ACTUAL: {
			mostrarPisoActual(asensorEdificio);
			break;
		}
		default:
			mensajeDeError("Opcion inexistente");
		}
		return opcion;
	}

	private static void mensajeDeBienvenida() {
		System.out.println("BIENVENIDO AL ASENSOR DEL EDIFICIO");
	}

	private static void mostrarPisoActual(Asensor asensorEdificio) {
		System.out.println("Piso actual: "+asensorEdificio.getPisoActual());
	}

	private static void irAlPiso(Scanner teclado, Asensor asensorEdificio) {
		System.out.print("Piso: ");
		int pisoDeseado = teclado.nextInt();
		while (asensorEdificio.irAlPiso(pisoDeseado) == false) {
			System.out.print("Piso inexistente. Ir a piso: ");
			pisoDeseado = teclado.nextInt();
		}
	}

	private static void bajar(Asensor asensorEdificio) {
		if (asensorEdificio.bajar()){
			System.out.println("Bajando.");
		}
		else {
			System.out.println("No se puede bajar.");
		}
	}

	private static void subir(Asensor asensorEdificio) {
		if (asensorEdificio.subir()){
			System.out.println("Subiendo.");
		}
		else {
			System.out.println("No se puede subir.");
		}
		
	}

	private static void cerrarPuerta(Asensor asensorEdificio) {
		asensorEdificio.cerrarPuerta();
		System.out.println("Cerrando puerta");
	}

	private static void abrirPuerta(Asensor asensorEdificio) {
		asensorEdificio.abrirPuerta();
		System.out.println("Abriendo puerta");
	}

	private static void mensajeDeError(String mensaje) {
		System.out.println(mensaje);
	}

	private static void mostrarOperacionesSobreAsensor() {
		System.out.println("a-Abrir puerta");
		System.out.println("b-Cerrar puerta");
		System.out.println("c-Subir");
		System.out.println("d-Bajar");
		System.out.println("e-Ir al piso");
		System.out.println("f-Piso actual");
		System.out.println("Opcion: ");
	}
}
