package trabajoPractico6;

import java.util.Scanner;

import trabajoPractico3.Persona;

public class EjemploAsensor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Asensor asensorEdificio = new Asensor(6, 500);
		
		Persona clarisa = new Persona(55.0);
		asensorEdificio.abrirPuerta();
		asensorEdificio.ingresar(clarisa);
		asensorEdificio.cerrarPuerta();
		
		System.out.print("Ir a piso: ");
		int pisoDeseado = teclado.nextInt();
		
		while(asensorEdificio.irAlPiso(pisoDeseado)==false){
			System.out.print("Piso inexistente. Ir a piso: ");
			pisoDeseado = teclado.nextInt();
		}
		
		
		System.out.println("Estas en el piso: "+asensorEdificio.getPisoActual());
		
		char opcion = '\0';
		
		while(opcion!=8) {
		System.out.println("Ingresar la opcion que desea");
		System.out.println("1-Abrir puerta");
		System.out.println("2-Cerrar puerta");
		System.out.println("3-Ingresar");
		System.out.println("4-Subir");
		System.out.println("5-Bajar");
		System.out.println("6-Salir");
		System.out.println("7-Ir al piso");
		System.out.println("8-Finalizar");
		
		MenuAsensor opcionDeseada;
		
	}
	}
}
