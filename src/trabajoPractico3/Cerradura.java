package trabajoPractico3;

public class Cerradura {
	private int claveDeApertura;
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private int cantidadDeFallosSeguidos;
	private boolean abierta;
	
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		this.cantidadDeFallosSeguidos= 0;
		this.abierta=false;
	}
	
	public boolean abrir(int clave) {
		if(this.fueBloqueada()) {
			return false;
		}
		if(clave!=this.claveDeApertura) {
			this.cantidadDeFallosSeguidos++;
			return false;
		}
		this.abierta = true;
		this.cantidadDeFallosSeguidos=0;
		return true;
	}
	
	public int getCantidadDeFallosSeguidos() {
		return this.cantidadDeFallosSeguidos;
	}
	public int getCantidadDeFallosConsecutivosQueLaBloquean() {
		return this.cantidadDeFallosConsecutivosQueLaBloquean;
	}
	
	public void cerrar() {
		this.abierta=false;
	}
	public boolean estaAbierta() {
		return this.abierta;
	}
	
	public boolean fueBloqueada() {
		if (this.cantidadDeFallosSeguidos==this.cantidadDeFallosConsecutivosQueLaBloquean) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Cerradura [claveDeApertura=" + claveDeApertura + ", cantidadDeFallosConsecutivosQueLaBloquean="
				+ cantidadDeFallosConsecutivosQueLaBloquean + ", cantidadDeFallosSeguidos=" + cantidadDeFallosSeguidos
				+ ", abierta=" + abierta + "]";
	}

	
	
	
	
}
