package trabajoPractico3;

import java.util.Scanner;

public class PruebaCubo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa la longitud del lado de Cubo");
		float lado = teclado.nextFloat();
		
		Cubo primerCubo = new Cubo(lado);
		System.out.println("Indique que operacion quiere realizar");
		System.out.println("1.Obtener longitud del lado del cubo");
		System.out.println("2.Otener la superfice de una de las caras");
		System.out.println("3.Obtener el volumen del cubo");
		
		int operacion = teclado.nextInt();
		
		switch (operacion) {
		case 1: {
			System.out.println("Lado: "+primerCubo.getLongitudLado()+" unidades");
			break;
		}
		case 2: {
			System.out.println("Superficie de la cara: "+primerCubo.getSuperficieCara()+" unidades cuadradas");
			break;
		}
		case 3: {
			System.out.println("Volumen del cubo: "+primerCubo.getVolumen()+" unidades cubicas");
			break;
		}
			
		default:
			System.out.println("El operacion indicada no existe");
		}
		
		
		teclado.close();
	}

}
