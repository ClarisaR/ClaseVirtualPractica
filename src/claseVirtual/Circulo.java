package claseVirtual;

public class Circulo {
	private double radio;
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularPerimetroDelCirculo() {
		double perimetro = 2* Math.PI * this.radio;
		return perimetro;
	}
	public double calcularAreaDelCirculo() {
		double area = Math.PI * this.radio * this.radio;
		return area;
	}
}
