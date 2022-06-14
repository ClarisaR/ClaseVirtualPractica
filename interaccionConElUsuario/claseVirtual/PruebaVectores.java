package claseVirtual;

public class PruebaVectores {
	
	public static void main(String[] args) {
		int numerosDeUnaCifra[];
		numerosDeUnaCifra = new int[10];
		
		for (int i = 0; i<numerosDeUnaCifra.length; i++) {
			numerosDeUnaCifra[i]=i;
			System.out.println("Posicion: "+i+" = "+numerosDeUnaCifra[i]);
		}
		System.out.println(numerosDeUnaCifra);
	}
}
