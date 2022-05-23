package trabajoPractico3;

public class Cerradura {
	private int claveDeApertura;
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private int cantidadDeFallosSeguidos;
	
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		this.cantidadDeFallosSeguidos= 0;
	}
	
	public boolean abrir(int clave) {
		if (clave == this.claveDeApertura) {
			this.cantidadDeFallosSeguidos=0;
			return true;
		}
		else {
			this.cantidadDeFallosSeguidos++;
			return false;
		}
	}
	
	public int getCantidadDeFallosSeguidos() {
		return this.cantidadDeFallosSeguidos;
	}
	public int getCantidadDeFallosConsecutivosQueLaBloquean() {
		return this.cantidadDeFallosConsecutivosQueLaBloquean;
	}
	
	public void cerrar() {
		
	}
	public void estaAbierta() {
			
	}
	public boolean fueBloqueada() {
		if (this.cantidadDeFallosSeguidos==this.cantidadDeFallosConsecutivosQueLaBloquean) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
