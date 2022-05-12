package trabajoPractico2;

public class EjemploDeClaculadora {

	public static void main(String[] args) {
		
		Calculadora casio = new Calculadora(5, 6);
		System.out.println("Suma: "+casio.sumar());
		
		Calculadora casio1 = new Calculadora(4.0);
		System.out.println("Area circulo: "+casio1.calcularAreaDeUnCirculo());
	}

}
