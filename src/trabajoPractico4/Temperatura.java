package trabajoPractico4;

public class Temperatura {
	public final byte CELSIUS = 1;
	public final byte FARENHEIT = 2;
	public final byte KELVIN = 3;
	private double valorEnCelsius;
	
	public Temperatura(double valor) {
		this.valorEnCelsius = valor;
	}
	
	public void setValor(double valor) {
		this.valorEnCelsius = valor;
	}
	
	public void setValor(double valor, byte unidad) {
		switch (unidad) {
			case CELSIUS: {
				this.valorEnCelsius = valor;
				break;
			}
			case FARENHEIT: {
				this.valorEnCelsius = (valor-32.0)*(5.0/9.0);
				break;
			}
			case KELVIN: {
				this.valorEnCelsius = valor-273.15;
			}
		}
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
				return (this.valorEnCelsius*9.0/5.0)+32.0; 
			}
			case KELVIN: {
				return this.valorEnCelsius+273.15; 
			}
			default: {
				return this.valorEnCelsius;
				
			}
		}
	}
}
