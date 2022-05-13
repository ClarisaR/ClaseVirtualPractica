package trabajoPractico2;
//Ejercicio 9

import java.lang.Math;
public class DiscoRigido {
	private double tamanio;
	private final int deTBaGB;
	
	
	public DiscoRigido(double tamanio){
		this.tamanio = tamanio;
		this.deTBaGB = 1024;
	}
	
	public int calcularCantidadDVD(double capacidadDVDenGB){
		double cantidadGB = this.tamanio * this.deTBaGB;
		double cantidadDVDs = cantidadGB / capacidadDVDenGB;
		return (int)Math.ceil(cantidadDVDs);
	}
	
	public int calcularCantidadBlueRays(double capacidadBlueRayenGB){
		double cantidadGB = this.tamanio * this.deTBaGB;
		double cantidadBlueRays = cantidadGB /capacidadBlueRayenGB ;
		return (int)Math.ceil(cantidadBlueRays);
	}
		
}
