package trabajoPractico5;

public class Calculadora {
		
	private double operador1;
	private double operador2;
	
	private double radio;

	public Calculadora() {
		this.operador1 = 0.0;
		this.operador2 = 0.0;
		this.radio =0.0;
	}
	public Calculadora(double radio) {
		this.radio = radio;
		this.operador1 = 0.0;
		this.operador2 = 0.0;
	}
	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
		this.radio = 0.0;
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
			return this.operador1/this.operador2; 
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
	
	//EJERCICO 1 TP5
	public int potencia (int base, int exponente) {
		int resultadoPotencia=1;
		for (int i=0; i<exponente;i++) {
			resultadoPotencia*= base; 
		}
		return resultadoPotencia;
	}
	//EJERCICIO 2 TP5
	public int sumatoria(int limite) {
		int resultadoSumatoria=0;
		for (int i=0;i<limite;i++) {
			resultadoSumatoria += i;
		}
		return resultadoSumatoria;
	}
	//EJERCICIO 3 TP5
	public int sumatoria(int limiteInferior, int limiteSuperior) {
		int resultadoSumatoria=0;
		for (int i = limiteInferior;i<=limiteSuperior;i++) {
			resultadoSumatoria +=i;
		}
		return resultadoSumatoria;
	}
	//EJERCICIO 4 TP5
	public int productoria(int limite) {
		int resultadoProductoria=1;
		for (int i=1; i<(limite); i++) {
			resultadoProductoria *= i;
		}
		return resultadoProductoria;
	}
	//EJERCICIO 5 TP5
	public int productoria(int limiteInferior, int limiteSuperior) {
		int resultadoProductoria=1;
		for(int i = limiteInferior; i<=limiteSuperior; i++) {
			resultadoProductoria *=i; 
		}
		return resultadoProductoria;
	}
	//EJERCICIO 6 TP5
	public String contarDivisores(int numero) {
		int restoDivision;
		String divisoresString="";
		for (int i=1; i<=numero; i++) {
			restoDivision = (numero%i);
			if (restoDivision==0) {
				divisoresString = divisoresString+" "+ i;
			}
		}
		return divisoresString;
	}
	
	public long factorial(int numero) {
		long factorial = 1;
		
		for (int i = numero; i>1;i--) {
			factorial*=i;
		}
		
		return factorial;
	}
}

