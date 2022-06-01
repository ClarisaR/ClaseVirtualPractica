package trabajoPractico4;

public class PruebaMotor {

	public static void main(String[] args) {
		String tipoDeFluido = "azul";
		String tipoDeCombustible = "gas";
		Motor motor1 = new Motor(Motor.BOMBA_DE_AGUA, tipoDeFluido, tipoDeCombustible);
		System.out.println(motor1.dimeTipoDeMotor());
		
		motor1.setTipoBomba(Motor.BOMBA_DE_GASOLINA);
		System.out.println(motor1.dimeTipoDeMotor());
		
		motor1.setTipoBomba(5);
		System.out.println(motor1.dimeTipoDeMotor());
		
	}
	
}
