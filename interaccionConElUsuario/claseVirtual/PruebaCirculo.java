package claseVirtual;

import java.util.Scanner;

public class PruebaCirculo {

	public static void main(String[] args) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		Circulo circulo = new Circulo();
		System.out.println("Ingrese el radio del circulo en centimetros");
		double radio = teclado.nextDouble();
		
		circulo.setRadio(radio);
		
		teclado.close();
		
		System.out.println("El perimetro del circulo es: "+circulo.calcularPerimetroDelCirculo()+" cm");
		System.out.println("El area del circulo es: "+circulo.calcularAreaDelCirculo()+" cm2");
	}

}
