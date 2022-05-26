package trabajoPractico4;

import java.util.Scanner;

public class PruebaLetra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresar una letra");
		char letra = teclado.next().charAt(0);
		
		Letra primerasLetras = new Letra(letra);
		
		if (primerasLetras.esVocal()) {
			System.out.println("La letra "+letra+" es una vocal");
		}
		else {
			System.out.println("La letra "+letra+" NO es una vocal");
		}
		

	}

}
