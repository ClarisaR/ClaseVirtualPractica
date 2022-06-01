package trabajoPractico3;

import java.util.Scanner;


public class EjemploDeCalculadora {

	public static void main(String[] args) {
		
		Calculadora casio = new Calculadora();
		casio= new Calculadora(8, 0);
		Scanner teclado = new Scanner(System.in);
		int numeroIngresado;
		System.out.println("Ingrese un numero");
		numeroIngresado = teclado.nextInt();
		if (casio.esPositivo(numeroIngresado)){
			System.out.println("El numero ingresado es Positivo");
		}
		else {
			System.out.println("El numero ingreado NO es positivo");
		}
		
		System.out.println("Division: "+casio.dividir());
		
		teclado.close();
	}

}
