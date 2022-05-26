package trabajoPractico4;

import java.util.Scanner;

public class PruebaRecorrido {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresar distancia en metros");
		double distanciaEnMetros = teclado.nextDouble();
		Recorrido recorridoUno = new Recorrido(distanciaEnMetros);
		System.out.println("Distancia en metros: "+recorridoUno.getValor());
		
		System.out.println("Ingresa otra distancia en metros");
		distanciaEnMetros = teclado.nextDouble();
		recorridoUno.setValor(distanciaEnMetros);
		System.out.println("Distancia en metros: "+recorridoUno.getValor());
		
		System.out.println("Ingresa otra distancia en decametros");
		double distancia = teclado.nextDouble();
		recorridoUno.setValor(distancia, recorridoUno.DECAMETRO);
		System.out.println("Distancia de decametros a metros: "+recorridoUno.getValor());
		
		System.out.println("Ingresa otra distancia en hectometros");
		distancia = teclado.nextDouble();
		recorridoUno.setValor(distancia, recorridoUno.HECTOMETRO);
		System.out.println("Distancia de hectometros a metros: "+recorridoUno.getValor());
		
		System.out.println("Ingresa otra distancia en Kilometros");
		distancia = teclado.nextDouble();
		recorridoUno.setValor(distancia, recorridoUno.KILOMETRO);
		System.out.println("Distancia de kilometros a metros: "+recorridoUno.getValor());
		
		System.out.println("Distancia en Decametros: "+recorridoUno.convertir(recorridoUno.DECAMETRO));
		System.out.println("Distancia en Hectometros: "+recorridoUno.convertir(recorridoUno.HECTOMETRO));
		System.out.println("Distancia en Kilometros: "+recorridoUno.convertir(recorridoUno.KILOMETRO));
	}

}
