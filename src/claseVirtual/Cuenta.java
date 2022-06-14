package claseVirtual;

public class Cuenta {
	private double saldo;
	public static final char DEPOSITAR = 'a';
	public static final char EXTRAER = 'b';
	public static final char VER_SALDO = 'c';
	public static final char SALIR = 'd';

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void depositar(double deposito) {
		this.saldo+=deposito;
	}
	public boolean extraer(double extraccion) {
		if(extraccion<=this.saldo) {
			this.saldo-=extraccion;
			return true;
		}
		return false;
	}
	
}
