package trabajoPractico3;

public class PruebaReferencia {

	public static void main(String[] args) {
		String texto1 = new String("Hola");
		String texto2 = new String("Hola");
		
		if (texto1==texto2){
			System.out.println("Los textos son iguales");
		}
		else{
			System.out.println("Los textos son distintos");
		}
		
		//Al ejecutar el resultado es "Los textos son distintos", ya que, la referencia que esta dentro de texto1 es diferente a la referencia que esta dentro de texto2.
		if (texto1.equals(texto2)){
			System.out.println("Los textos son iguales");
		}
		else{
			System.out.println("Los textos son distintos");
		}
		//En la segunda comparacion utilizamos el metodo equals(), y el resultyado es "Los textos son iguales", ya que, este metodo compara los contenidos de los objetos texto1 y texto2
	}

}
