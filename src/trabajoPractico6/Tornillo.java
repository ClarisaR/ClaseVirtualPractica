package trabajoPractico6;

public class Tornillo {
	private final char TIPO_DE_CABEZA;
	private final int LONGITUD;
	private final int CANTIDAD_DE_ROSCA;
	private char posicionActual;
	public static final char PLANA = 'P';
	public static final char PHILLIPS= 'H';
	public static final char ALLEN = 'A';
	
	public Tornillo(char tipoDeCabeza, int longitud, int cantidadDeRoscas){
		this.TIPO_DE_CABEZA = tipoDeCabeza;
		this.LONGITUD = longitud;
		this.CANTIDAD_DE_ROSCA = cantidadDeRoscas;
		this.posicionActual = 'H';
	}
	
	public int getLongitud(){
		return this.LONGITUD;
	}
	
	public char getTipoDeCabeza(){
		return this.TIPO_DE_CABEZA;
	}
	
	public boolean girar(char sentido){
		while (sentido=='H'||sentido=='A'){
			this.posicionActual = sentido;
			return true;
		}
		return false;
	}
}
