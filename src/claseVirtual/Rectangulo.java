package claseVirtual;

public class Rectangulo {
	private int base;
	private int altura;
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calcularPerimetroDelRectangulo() {
		return 2*(this.base + this.altura);
	}
	
	public int calcularAreaDelRectangulo() {
		return this.base*this.altura;
	}
}
