package trabajoPractico2;
//Ejercicio 9
public class DiscoRigido {
	private int tamaño;
	final long deTBaGB = 1024;
	
	
	public DiscoRigido(int tamaño){
		this.tamaño = tamaño;
	}
	
	public long calcularCantidadDVD(){
		double tamanioDVDenGB = 4.5;
		long cantidadGB = this.tamaño * this.deTBaGB;
		double cantidadDVDs = cantidadGB / tamanioDVDenGB;
		return (long)Math.ceil(cantidadDVDs);
	}
	
	public long calcularCantidadBlueRays(){
		int tamañoBlueRayEnGB = 15;
		long cantidadGB = this.tamaño * this.deTBaGB;
		double cantidadBlueRays = cantidadGB / tamañoBlueRayEnGB;
		return (long)Math.ceil(cantidadBlueRays);
	}
		
}
