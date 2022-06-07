package claseVirtual;

public class PruebaWrapper {

	public static void main(String[] args) {
		int a = 5;
		
		Integer b = new Integer(5);
		
		Integer c = new Integer(5);
		
		
		System.out.println(b==c);
		System.out.println(b.compareTo(c));
		
	}

}
