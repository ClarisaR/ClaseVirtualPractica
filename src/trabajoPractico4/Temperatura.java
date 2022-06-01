package trabajoPractico4;

public class Temperatura {
	public static final byte CELSIUS = 1;
	public static final byte FARENHEIT = 2;
	public static final byte KELVIN = 3;
	private double valorEnCelsius;
	private final double CONSTANTE_FARENHEIT_SUMA_RESTA = 32.0;
	private final double CONSTANTE_FARENHEIT_MULTIPLICACION_DIVISION = 5.0/9.0;
	private final double CONSTANTE_KELVIN = 273.15;
	
	public Temperatura(double valor) {
		this.valorEnCelsius = valor;
	}
	
	public void setValor(double valor) {
		this.valorEnCelsius = valor;
	}
	
	public void setValor(double valor, byte unidad) {
		this.valorEnCelsius = this.convertirACelsius(valor, unidad);
	}
	
	private double convertirACelsius(double valor, byte unidad) {
		double valorEnCelsius = 0.0;
		switch (unidad) {
			case CELSIUS: {
				 valorEnCelsius = valor;
				break;
			}
			case FARENHEIT: {
				valorEnCelsius = (valor-CONSTANTE_FARENHEIT_SUMA_RESTA)*(CONSTANTE_FARENHEIT_MULTIPLICACION_DIVISION);
				break;
			}
			case KELVIN: {
				valorEnCelsius = valor-CONSTANTE_KELVIN;
			}
		}
		return valorEnCelsius;
	}
	
	public double getValor() {
		return this.valorEnCelsius;
	}
	
	public double convertir(byte unidad) {
		switch (unidad) {
			case CELSIUS: {
				return this.valorEnCelsius;
			}
			case FARENHEIT: {
				return (this.valorEnCelsius/CONSTANTE_FARENHEIT_MULTIPLICACION_DIVISION)+CONSTANTE_FARENHEIT_SUMA_RESTA; 
			}
			case KELVIN: {
				return this.valorEnCelsius+CONSTANTE_KELVIN; 
			}
			default: {
				return this.valorEnCelsius;
				
			}
		}
	}
}
