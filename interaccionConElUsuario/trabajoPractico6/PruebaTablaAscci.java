package trabajoPractico6;

public class PruebaTablaAscci {

	public static void main(String[] args) {
		
		System.out.println("CARACTERES NUMERICOS: ");
		char caracteresNumericos=48;
		while(caracteresNumericos>=48 && caracteresNumericos<=57){
			System.out.print(" "+caracteresNumericos+" ");
			caracteresNumericos++;
		}
		System.out.println(" ");
		
		System.out.println("LETRAS MINUSCULAS: ");
		char letrasMinusculas=97;
		while(letrasMinusculas>=97 && letrasMinusculas<=122){
			System.out.print(" "+letrasMinusculas+" ");
			letrasMinusculas++;
		}
		System.out.println(" ");
		
		System.out.println("LETRAS MAYUSCULAS: ");
		char letrasMayusculas=65;
		while(letrasMayusculas>=65 && letrasMayusculas<=90){
			System.out.print(" "+letrasMayusculas+" ");
			letrasMayusculas++;
		}
		System.out.println(" ");
		
		System.out.println("CARACTERES ESPECIALES: ");
		char caracteresEspeciales=0;
		while((caracteresEspeciales>=0 && caracteresEspeciales<=47)){
			System.out.print(" "+caracteresEspeciales+" ");
			caracteresEspeciales++;
		}
		
		caracteresEspeciales = 58;
		while((caracteresEspeciales>=58 && caracteresEspeciales<=64)){
			System.out.print(" "+caracteresEspeciales+" ");
			caracteresEspeciales++;
		}
		
		caracteresEspeciales = 91;
		while((caracteresEspeciales>=91 && caracteresEspeciales<=96)){
			System.out.print(" "+caracteresEspeciales+" ");
			caracteresEspeciales++;
		}
		
		caracteresEspeciales = 123;
		while((caracteresEspeciales>=123 && caracteresEspeciales<=255)){
			System.out.print(" "+caracteresEspeciales+" ");
			caracteresEspeciales++;
		}
	}

}
