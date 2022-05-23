package trabajoPractico3;

import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese nombre del titular");
		String titular = teclado.nextLine();
		Cuenta cliente1 = new Cuenta(titular);
		System.out.println("Titular: "+cliente1.getTitular());
		System.out.println("Saldo: "+cliente1.getSaldo());
		
		System.out.println("Depositar:");
		double dineroADepositar = teclado.nextDouble();
		cliente1.depositar(dineroADepositar);
		
		System.out.println("Retirar:");
		double dineroARetirar = teclado.nextDouble();
		
		if (cliente1.retirar(dineroARetirar)) {
			System.out.println("Retiro: "+ dineroARetirar+ " de su cuenta");
		}
		else{
				System.out.println("El monto que quiere retirar excede al saldo");
		}	
	
		System.out.println(cliente1.toString());
	}
}

