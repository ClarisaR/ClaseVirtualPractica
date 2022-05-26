package trabajoPractico3;

import java.util.Scanner;

public class PruebaCerradura {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Cerradura puertaTaller = new Cerradura(123456, 3);
		System.out.println(puertaTaller);
		int clave;
		do {
			System.out.println("Ingrese la clave que abre la cerradura");
			clave = teclado.nextInt();
			System.out.println(puertaTaller);
		} while (puertaTaller.abrir(clave)==false&&puertaTaller.fueBloqueada()==false);
		
		if (puertaTaller.estaAbierta()) {
			System.out.println("La cerradura se abrio");
		}
		if (puertaTaller.fueBloqueada()) {
			System.out.println("La cerradura esta bloqueada");
		}
		
		System.out.println(puertaTaller);
		
		teclado.close();
	}

}
