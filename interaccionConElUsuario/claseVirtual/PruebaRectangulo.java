package claseVirtual;

import java.util.Scanner;

public class PruebaRectangulo {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		Rectangulo rectangulo = new Rectangulo();
		System.out.println("Ingrese base del rectangulo en cm");
		int base = teclado.nextInt();
		rectangulo.setBase(base);
		
		System.out.println("Ingrese altura del rectangulo en cm");
		int altura = teclado.nextInt();
		rectangulo.setAltura(altura);
		
		teclado.close();
		
		System.out.println("Perimetro del rectangulo: "+rectangulo.calcularPerimetroDelRectangulo()+" cm");
		System.out.println("Area del rectangulo: "+rectangulo.calcularAreaDelRectangulo()+ " cm2");
		
		

	}

}
