package trabajoPractico2;

public class EjemploDeClaculadora {

	public static void main(String[] args) {
		Calculadora casio = new Calculadora(5, 6);
		System.out.println(casio.sumar());
		Calculadora laCalculadoraDelCelular = new Calculadora();
		System.out.println(Calculadora.sumar(2, 3));
	}

}
