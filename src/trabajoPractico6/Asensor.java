package trabajoPractico6;

import trabajoPractico3.Persona;

public class Asensor {
	private final int PISO_MAXIMO;
	private final int PISO_MINIMO;
	private final double PESO_MAXIMO;
	private final int CAPACIDAD_MAXIMA;
	private boolean puertaAbierta;
	private boolean sobreCarga;
	private int pisoActual;
	private double pesoActual;
	private int capacidadActual;
	
	public static final char ABRIR_PUERTA = 'a';
	public static final char CERRAR_PUERTA = 'b';
	public static final char SUBIR = 'c';
	public static final char BAJAR  = 'd';
	public static final char IR_AL_PISO = 'e';
	public static final char PISO_ACTUAL = 'f';
	
	public Asensor(int capacidadMaxima, double pesoMaximo) {
		this.PISO_MAXIMO = 20;
		this.PISO_MINIMO = 0;
		this.CAPACIDAD_MAXIMA = capacidadMaxima;
		this.PESO_MAXIMO = pesoMaximo;
		this.puertaAbierta = true;
		this.sobreCarga = false;
		this.pisoActual = 0;
		this.pesoActual = 0;
		this.capacidadActual = 5;
	}
	
	public void ingresar(Persona elQueSube) {
		this.pesoActual = this.pesoActual + elQueSube.getPeso();
	}
	public void salir(Persona elQueBaja) {
		this.pesoActual = this.pesoActual - elQueBaja.getPeso();
	}
	public void abrirPuerta(){
		this.puertaAbierta=true;
	}
	
	public boolean sobrecargado() {
		if (this.pesoActual>this.PESO_MAXIMO) {
			return true;
		}
		return false;
	}
	
	public boolean cerrarPuerta() {
		if (this.pesoActual<=this.PESO_MAXIMO) {
			this.puertaAbierta = false;
			return true;
		}
			return false;
	}
	
	
	public boolean subir() {
		if(this.pisoActual==this.PISO_MAXIMO) {
			return false;
		}
		if (this.puertaAbierta==true) {
			return false;
		}
		this.pisoActual++;
		return true;
	}
	public boolean bajar() {
		if(this.pisoActual==this.PISO_MINIMO) {
			return false;
		}
		if (this.puertaAbierta==true) {
			return false;
		}
		this.pisoActual--;
		return true;
	}
	public int getPisoActual() {
		return this.pisoActual;
	}
	public boolean irAlPiso(int pisoDeseado) {
		while (pisoDeseado<=this.PISO_MAXIMO && pisoDeseado>=this.PISO_MINIMO){
			this.pisoActual = pisoDeseado;
			return true;
		}
		return false;
	}
	
}
