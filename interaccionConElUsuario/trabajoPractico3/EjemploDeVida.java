package trabajoPractico3;

import java.util.Scanner;

public class EjemploDeVida {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nombre:");
		String nombre = teclado.nextLine();
		System.out.println("Genero:");
		String genero = teclado.nextLine();
		System.out.println("DNI:");
		long dni = teclado.nextLong();
		System.out.println("Peso:");
		double peso=teclado.nextDouble();
		System.out.println("Edad:");
		int edad = teclado.nextInt();
		System.out.println("Altura:");
		double altura=teclado.nextDouble();
		Persona persona1 = new Persona(nombre, genero, dni, peso, altura);
		
		persona1.setEdad(edad);
		
		if (persona1.esMayorDeEdad()){
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("No es mayor de edad");
		}
	}

}
