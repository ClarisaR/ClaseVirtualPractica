package claseVirtual;

public class Cuenta {
	private double saldo;

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
