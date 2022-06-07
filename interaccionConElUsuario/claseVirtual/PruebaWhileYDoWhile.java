package claseVirtual;


import java.util.Scanner;

public class PruebaWhileYDoWhile {

	public static void main(String[] args) throws Exception {
		Scanner teclado = new Scanner(System.in);
		
		while(true) {
			System.out.println("0 -> break");
			System.out.println("1 -> continue");
			
			System.out.print("Ingrese opcion: ");
			
			int opcion = teclado.nextInt();
			
			if (opcion==0) {
				System.out.println("Haciendo \"break\"");
				break;
			}
			if (opcion==1) {
				System.out.println("Haciendo \"continue\"");
				continue;
			}
			System.out.println("Estoy al final del \"while\"");
		}
		
		System.out.println("Fin del programa");
		System.err.println("Estoy imprimiendo por el flujo de salida de errores, PrintStream");
		
		throw new Exception("Lanzando un error que va a recibirlo la salida estandar de errores");
	}

}
