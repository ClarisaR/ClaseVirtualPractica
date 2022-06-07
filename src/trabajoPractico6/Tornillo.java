package trabajoPractico6;

public class Tornillo {
	private final char TIPO_DE_CABEZA;
	private final int LONGITUD;
	private final int CANTIDAD_DE_ROSCA;
	private int posicionActual;
	
	public Tornillo(char tipoDeCabeza, int longitud, int cantidadDeRoscas){
		this.TIPO_DE_CABEZA = tipoDeCabeza;
		this.LONGITUD = longitud;
		this.CANTIDAD_DE_ROSCA = cantidadDeRoscas;
		this.posicionActual = 0;
	}
	
	public int getLongitud(){
		return this.LONGITUD;
	}
	
	public char getTipoDeCabeza(){
		return this.TIPO_DE_CABEZA;
	}
	
	public boolean girar(char sentido){
		while (sentido==0||sentido==1){
			this.posicionActual = sentido;
			return true;
		}
		return false;
	}
}
