package trabajoPractico6;

public class PruebaTablaAscci {

	public static void main(String[] args) {
		
		System.out.println("CARACTERES NUMERICOS: ");
		mostrarCaracteres(48, 57);
		System.out.println(" ");
		
		System.out.println("LETRAS MINUSCULAS: ");
		mostrarCaracteres(97, 122);
		System.out.println(" ");
		
		System.out.println("LETRAS MAYUSCULAS: ");
		mostrarCaracteres(65, 90);
		System.out.println(" ");
		
		System.out.println("CARACTERES ESPECIALES: ");
		mostrarCaracteres(0, 47);
		mostrarCaracteres(58, 64);
		mostrarCaracteres(91, 96);
		mostrarCaracteres(123, 255);
	}

	public static void mostrarCaracteres(int inicio, int fin) {
		int caracterActual = inicio;
		while(caracterActual>=inicio && caracterActual<=fin) {
			System.out.print(" "+(char)caracterActual+" ");
			caracterActual++;
		}
	}
}
