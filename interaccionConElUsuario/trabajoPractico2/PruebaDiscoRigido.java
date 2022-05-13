package trabajoPractico2;

public class PruebaDiscoRigido {

	public static void main(String[] args) {
		
		DiscoRigido seagate = new DiscoRigido(10);
		System.out.println("Disco Rigido: Seagate de 10TB");
		System.out.println("10TB equivale a "+seagate.calcularCantidadDVD(4.5)+" DVDs");
		System.out.println("10TB equivale a "+seagate.calcularCantidadBlueRays(10)+" Blue Rays");
		
		
		
		DiscoRigido hitachi = new DiscoRigido(20);
		System.out.println("Disco Rigido: Hitachi de 20TB");
		System.out.println("20TB equivale a "+hitachi.calcularCantidadDVD(4.5)+" DVDs");
		System.out.println("20TB equivale a "+hitachi.calcularCantidadBlueRays(15)+" Blue Rays");
		
		DiscoRigido westernDigital = new DiscoRigido(32);
		System.out.println("Disco Rigido: Hitachi de 32TB");
		System.out.println("32TB equivale a "+westernDigital.calcularCantidadDVD(4.0)+" DVDs");
		System.out.println("32TB equivale a "+westernDigital.calcularCantidadBlueRays(5.5)+" Blue Rays");
		
		DiscoRigido toshiba = new DiscoRigido(48);
		System.out.println("Disco Rigido: Toshiba de 48 TB");
		System.out.println("48TB equivale a "+toshiba.calcularCantidadDVD(4.5)+" DVDs");
		System.out.println("48TB equivale a "+toshiba.calcularCantidadBlueRays(5)+" Blue Rays");
	}
	
}
