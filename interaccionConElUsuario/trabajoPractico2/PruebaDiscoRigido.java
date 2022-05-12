package trabajoPractico2;

public class PruebaDiscoRigido {

	public static void main(String[] args) {
		
		DiscoRigido seagate = new DiscoRigido(10);
		System.out.println("Disco Rigido: Seagate de 10TB");
		System.out.println("10TB equivale a "+seagate.calcularCantidadDVD()+" DVDs");
		System.out.println("10TB equivale a "+seagate.calcularCantidadBlueRays()+" Blue Rays");
		
		
		
		DiscoRigido hitachi = new DiscoRigido(20);
		System.out.println("Disco Rigido: Hitachi de 20TB");
		System.out.println("20TB equivale a "+hitachi.calcularCantidadDVD()+" DVDs");
		System.out.println("20TB equivale a "+hitachi.calcularCantidadBlueRays()+" Blue Rays");
		
		DiscoRigido westernDigital = new DiscoRigido(32);
		System.out.println("Disco Rigido: Hitachi de 32TB");
		System.out.println("32TB equivale a "+westernDigital.calcularCantidadDVD()+" DVDs");
		System.out.println("32TB equivale a "+westernDigital.calcularCantidadBlueRays()+" Blue Rays");
		
		DiscoRigido toshiba = new DiscoRigido(48);
		System.out.println("Disco Rigido: Toshiba de 48 TB");
		System.out.println("48TB equivale a "+toshiba.calcularCantidadDVD()+" DVDs");
		System.out.println("48TB equivale a "+toshiba.calcularCantidadBlueRays()+" Blue Rays");
	}
	
}
