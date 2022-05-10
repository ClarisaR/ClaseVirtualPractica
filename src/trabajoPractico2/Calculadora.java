package trabajoPractico2;

public class Calculadora {
	//atributos
	private double operador1;
	private double operador2;
	//constructores
	public Calculadora() {
		
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
}
