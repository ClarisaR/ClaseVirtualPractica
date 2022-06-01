package trabajoPractico5;

public class EjemploDeCalculadora {

	public static void main(String[] args) {
		Calculadora casio = new Calculadora();
		
		//POTENCIA
		
		System.out.println("Potencia: "+casio.potencia(5, 0));
		
		System.out.println("Sumatoria: "+casio.sumatoria(10));
		
		System.out.println("Sumatoria: "+casio.sumatoria(2, 5));
		
		System.out.println("Productoria: "+casio.productoria(5));
		System.out.println("Productoria: "+casio.productoria(2, 5));
		
		System.out.println("Divisores: "+casio.contarDivisores(10));
		System.out.println("Divisores: "+casio.contarDivisores(19));
		
		//Factorial
		int numero = 5;
		System.out.println("Factorial del numero "+numero+": "+casio.factorial(numero));
	}

}
