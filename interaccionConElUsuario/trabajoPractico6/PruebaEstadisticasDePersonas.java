package trabajoPractico6;

import java.util.Scanner;

import trabajoPractico3.Persona;

public class PruebaEstadisticasDePersonas {

	public static void main(String[] args) {
		Persona nueva;
		int numeroDePersona = 1, cantidadDePersonasConBajoPeso = 0, cantidadDePersonasConPesoNormal = 0, cantidadDePersonasConSobrePeso=0;
		final int MUESTRA = 50;
		double sumatoriaDelPeso = 0.0, sumatoriaDeLaEdadConBajoPeso=0.0, sumatoriaDeLaEdadConSobrepeso = 0.0;
		
		while(numeroDePersona<=MUESTRA) {
			nueva = ingresarUnaNuevaPersona();
		}
		
	}
	
	private static Persona ingresarUnaNuevaPersona() {
		int peso, altura, edad;
		Scanner teclado = new Scanner(System.in);
		Persona actual;
		
		System.out.println("Ingrese el peso: ");
		peso = teclado.nextInt();
		System.out.println("Ingrese la altura: ");
		altura = teclado.nextInt();
		System.out.println("Ingrese la edad: ");
		edad = teclado.nextInt();
		actual = new Persona(peso, altura, edad);
		
		
		return actual;
	}

}
