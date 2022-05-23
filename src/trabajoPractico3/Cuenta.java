package trabajoPractico3;

public class Cuenta {
	private String titular;
	private double saldo;
	
	public Cuenta(String titular) {
		this.titular = titular;
		this.saldo = 0.0;
	}
	public Cuenta(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	}
	
	public String getTitular() {
		return this.titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return this.saldo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titular: "+this.titular+" Saldo: "+this.saldo;
	}
	
	
	public void depositar(double cantidad) {
		this.saldo = this.saldo + cantidad;
	}
	public boolean retirar(double cantidad) {
		if (cantidad<=this.saldo) {
		this.saldo = this.saldo - cantidad;
		return true;
		}
		else {
			return false;
		}
		
	}
}

