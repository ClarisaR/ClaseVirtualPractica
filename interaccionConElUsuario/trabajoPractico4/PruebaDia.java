package trabajoPractico4;

import java.util.Scanner;

public class PruebaDia {

	public static void main(String[] args) {
		int numeroDeDia = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresar numero de dia");
		numeroDeDia = teclado.nextInt();
		
		System.out.println("El dia:  "+numeroDeDia+" es "+Dia.elNombreEs(numeroDeDia));
		teclado.close();
	}

}
