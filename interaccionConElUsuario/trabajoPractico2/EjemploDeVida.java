package trabajoPractico2;

public class EjemploDeVida {

	public static void main(String[] args) {
		
		//a y b
		
		
		Persona sofia = new Persona("Sofia", "Mujer", 38432153, 2.8, 0.50);
		
		//c. 

		System.out.println(sofia);
		
		//Al imprimir la variable sofia, observamos el codigo de referencia al objeto sofia.
		
		//d.
		System.out.println("El peso de Sofia es: "+sofia.devolverPeso());
		System.out.println("La altura de Sofia es:"+sofia.devolverAltura());
		
		//e. 
		sofia.alimentar(1.0);
		sofia.crecer(0.5);
		sofia.cumplirAnios();
		
		//f.
		System.out.println("El peso de Sofia es: "+sofia.devolverPeso());
		System.out.println("La altura de Sofia es:"+sofia.devolverAltura());
		//Al imprimir por pantalla luego vemos que el peso paso de 2.8 a 3.8 (engordo 1.0), y altura aumento de 0.5 a 1.0 (creció 0.5)
	}

}
