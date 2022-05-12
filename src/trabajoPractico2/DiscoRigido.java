package trabajoPractico2;
//Ejercicio 9
public class DiscoRigido {
	private int tama�o;
	final long deTBaGB = 1024;
	
	
	public DiscoRigido(int tama�o){
		this.tama�o = tama�o;
	}
	
	public long calcularCantidadDVD(){
		double tamanioDVDenGB = 4.5;
		long cantidadGB = this.tama�o * this.deTBaGB;
		double cantidadDVDs = cantidadGB / tamanioDVDenGB;
		return (long)Math.ceil(cantidadDVDs);
	}
	
	public long calcularCantidadBlueRays(){
		int tama�oBlueRayEnGB = 15;
		long cantidadGB = this.tama�o * this.deTBaGB;
		double cantidadBlueRays = cantidadGB / tama�oBlueRayEnGB;
		return (long)Math.ceil(cantidadBlueRays);
	}
		
}
