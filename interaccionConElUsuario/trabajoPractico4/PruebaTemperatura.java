package trabajoPractico4;

import java.util.Scanner;

public class PruebaTemperatura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresar temperatura en celsius");
		double valorTemperatura = teclado.nextDouble();
		Temperatura temperatura = new Temperatura(valorTemperatura);
		
		System.out.println("Valor temperatura: "+temperatura.getValor()+" grados Celsius");
		
		//FARENHEIT
		System.out.println("Ingresar temperatura en Farenheit");
		valorTemperatura = teclado.nextDouble();
		
		temperatura.setValor(valorTemperatura, temperatura.FARENHEIT);
		
		System.out.println("Valor temperatura: "+temperatura.getValor()+" grados Celsius");
		
		//KELVIN
		System.out.println("Ingresar temperatura en Kelvin");
		valorTemperatura = teclado.nextDouble();
		
		temperatura.setValor(valorTemperatura, temperatura.KELVIN);
		
		System.out.println("Valor temperatura: "+temperatura.getValor()+" grados Celsius");
		
		System.out.println("Valor temperatura: "+temperatura.getValor()+" grados Celsius");
		
		System.out.println(temperatura.convertir(temperatura.FARENHEIT));
		teclado.close();
	}

}
