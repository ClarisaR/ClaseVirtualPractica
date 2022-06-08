package claseVirtual;

import java.util.Scanner;

public class EjercicioHomero {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
			System.out.println("Para comenzar");
			System.out.println("Presione cualquier tecla");
			teclado.next();
			
		while(true) {
			System.out.println("Revisar temperatura del nucleo");
			System.out.println("Si/No");
			String respuesta = teclado.next().toUpperCase();
			
			switch (respuesta) {
				case "SI": {
					System.out.println("Temperatura del nucleo normal");
				}
				break;
				case "NO": {
					System.out.println("");
				}
				break;
				default: {
					System.out.println("Opcion incorrecta");
				}
			}
			
			System.out.println("Ventilar gas radiactivo?");
			System.out.println("Si/No");
			respuesta = teclado.next().toUpperCase();
			
			switch (respuesta) {
				case "SI": {
					System.out.println("Ventilando gas");
				}
				break;
				case "NO": {
					System.out.println("Esta seguro? Ventilar gas?");
					System.out.println("Si/No");
					respuesta = teclado.next().toUpperCase();
					if (respuesta.equals("SI")) {
						System.out.println("Ventilando gas");
					}
					else {
						System.out.println("La ventilacion evita la explosion");
					}
				}
				break;
				default: {
					System.out.println("Opcion incorrecta");
					
				}
			}
		}
	}
}
