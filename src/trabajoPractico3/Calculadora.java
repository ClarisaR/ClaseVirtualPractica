package trabajoPractico3;

public class Calculadora {
	
	private double operador1;
	private double operador2;
	
	private double radio;

	public Calculadora() {
		this.operador1=0.0;
		this.operador2=0.0;
	}
	public Calculadora(double radio) {
		this.radio = radio;
	}
	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}

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
		if (this.operador2==0) {
			return 0.0;
		}else {
			return this.operador1/this.operador2; 
		}
	}
	
	public static double dividir(double operador1, double operador2) {
		return operador1/operador2; 
	}
	
	public double calcularAreaDeUnCirculo(){
		return (Math.PI)*this.radio* this.radio;
	}
	
	public boolean esPositivo(int numeroIngresado){
		if (numeroIngresado>0) {
			return true;
		}
		else{
			return false;
		}
	}
}


