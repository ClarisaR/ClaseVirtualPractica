package trabajoPractico4;

import java.util.Scanner;

public class PruebaDia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresar numero de dia");
		int numeroDeDia = teclado.nextInt();
		Dia dia = new Dia(numeroDeDia);
		
		System.out.println("Dia segun el numero ingresado: "+dia.getDia());
		teclado.close();
	}

}
