package trabajoPractico2;
//Ejercicio 5.
public class Calculadora {
	//atributos
	private double operador1;
	private double operador2;
	//Ejercicio 7
	private double radio;

	//constructores
	public Calculadora(double radio) {
		this.radio = radio;
	}
	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}
	//metodos
	public double sumar(){
		return this.operador1 + this.operador2;
	}
	public static double sumar(double operador1, double operador2) {
		return operador1 + operador2;
	}
	public double restar() {
		return this.operador1 - this.operador2;
	}
	public static double restar(double operador1, double operador2) {
		return operador1 - operador2;
	}
	public double multiplicar() {
		return this.operador1* this.operador2;
	}
	public static double multiplicar(double operador1, double operador2) {
		return operador1*operador2; 
	}
	public double dividir() {
		return this.operador1/this.operador2; 
	}
	public static double dividir(double operador1, double operador2) {
		return operador1/operador2; 
	}
	//Ejercicio 7
	public double calcularAreaDeUnCirculo(){
		return (Math.PI)*this.radio* this.radio;
	}
}

//Ejercicio 6.
/*
 6. Como sabes, para poder utilizar una clase en Java, es necesario instanciar un objeto de
dicha clase. Sin embargo, existen casos en los que esto no se cumple. Tomando como base
los ejemplos vistos hasta el momento, ¿Te animás a identificar en qué caso no estamos
instanciando la clase para poder utilizarla? ¿Cómo explicarías esta situación? 


Los casos es los que no estamos instanciando la clase para poder utilizarla, es cuando la
clase contiene el método main. Dentro del método main podremos instanciar objetos de 
otras clases, utilizar sus atributos, y ejecutar sus métodos.
 */
