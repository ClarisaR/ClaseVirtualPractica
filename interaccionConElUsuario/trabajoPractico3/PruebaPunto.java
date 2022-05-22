package trabajoPractico3;

import java.util.Scanner;

public class PruebaPunto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese coordenada en X");
		double coordenadaEnX = teclado.nextDouble();
		System.out.println("Ingrese coordenada en Y");
		double coordenadaEnY = teclado.nextDouble();
		
		Punto A = new Punto(coordenadaEnX, coordenadaEnY);
		
		
		if (A.estaEnElEjeX()){
			System.out.println("El punto ("+coordenadaEnX+";"+coordenadaEnY+") esta sobre el eje X");
		}
		
		if (A.estaEnElEjeY()){
			System.out.println("El punto ("+coordenadaEnX+";"+coordenadaEnY+") esta sobre el eje Y");
		}
		
		if(A.estaEnElOrigenDeLasCoordenadas()){
			System.out.println("El punto ("+coordenadaEnX+";"+coordenadaEnY+") esta en el origen de las coordenadas");
		}
		
		System.out.println("La coordenada en X es: "+A.getCoordenadaEnX());
		System.out.println("La coordenada en Y es: "+A.getCoordenadaEnY());
		
		teclado.close();
	}
	
		

}
