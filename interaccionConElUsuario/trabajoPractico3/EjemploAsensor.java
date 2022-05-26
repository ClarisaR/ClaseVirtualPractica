package trabajoPractico3;

import java.util.Scanner;

public class EjemploAsensor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Asensor consorcioCallePeron = new Asensor(4, 150);
		
		System.out.println("Piso actual: "+consorcioCallePeron.getPisoActual());
		
		consorcioCallePeron.subir();
		consorcioCallePeron.subir();
		consorcioCallePeron.subir();
		
		//Se encuentra en el mismo piso, no subio, ya que la puerta esta abierta.
		
		System.out.println("Piso actual: "+consorcioCallePeron.getPisoActual());
		
		Persona primeraPersona = new Persona(60);
		Persona segundaPersona = new Persona(80);
		Persona terceraPersona = new Persona(90);
		
		consorcioCallePeron.abrirPuerta();
		
		consorcioCallePeron.ingresar(primeraPersona);
		consorcioCallePeron.ingresar(segundaPersona);
		consorcioCallePeron.ingresar(terceraPersona);
		
		System.out.println(consorcioCallePeron.cerrarPuerta());
		
		System.out.println(consorcioCallePeron.subir());
		
		System.out.println(consorcioCallePeron.sobrecargado());
		
		//el ansensor no cierra la puerta, ya que esta sobrecargado de peso.
	}
}
