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
		

	}

}
