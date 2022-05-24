package trabajoPractico3;

public class Alarma {
	private boolean sensorDeMovimiento;
	private boolean sensorDeContacto;
	private boolean sensorDeSonido;
	private boolean encendida;
	private int codigoDeSeguridad;
	
	public Alarma(int codigoDeSeguridad){
		this.sensorDeMovimiento = true;
		this.sensorDeContacto = true;
		this.sensorDeSonido = true;
		this.encendida = true;
		this.codigoDeSeguridad = 0;
	}
	
	public void encender(){
		this.encendida = true;
	}
	public void apagar(){
		this.encendida = false;
	}
	public boolean activada(){
		return this.encendida = true;
	}
}
