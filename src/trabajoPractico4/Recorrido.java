package trabajoPractico4;

public class Recorrido {
	public final byte DECAMETRO = 1;
	public final byte HECTOMETRO = 2;
	public final byte KILOMETRO = 3;
	private double distanciaEnMetros;
	
	public Recorrido(double distanciaEnMetros){
		this.distanciaEnMetros= distanciaEnMetros;
	}
	
	public void setValor(double distanciaEnMetros){
		this.distanciaEnMetros = distanciaEnMetros;
	}
	public void setValor(double valor, byte unidad){
		switch (unidad) {
			case DECAMETRO: {
				this.distanciaEnMetros = valor*10.0;
				break;
			}
			case HECTOMETRO: {
				this.distanciaEnMetros = valor*100.0;
				break;
			}
			case KILOMETRO: {
				this.distanciaEnMetros = valor*1000.0;
			}
		}
	}
	public double getValor(){
		return this.distanciaEnMetros;
	}
	public double convertir(byte unidad){
		switch (unidad) {
			case DECAMETRO:{
				return this.distanciaEnMetros/10.0;
			}
			case HECTOMETRO:{
				return this.distanciaEnMetros/100.0;
			}
			case KILOMETRO:{
				return this.distanciaEnMetros/1000.0;
			}
			default: {
				return this.distanciaEnMetros;
			}
		}
	}
}
