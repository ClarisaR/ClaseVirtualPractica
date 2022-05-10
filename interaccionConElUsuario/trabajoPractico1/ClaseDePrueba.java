package trabajoPractico1;
public class ClaseDePrueba {

	public static void main(String[] args) {
		int preIncremento = 5;
		int postIncremento = 5;
		
		System.out.println("Pre Incremento: "+ ++preIncremento);
		System.out.println("Post Incremento: "+ postIncremento++);
		//Comprobamos
		System.out.println("Post Incremento: "+ postIncremento++);
		
		//otro ejemplo
		int a = 10;
		int b = a++;
		System.out.println(b);
		b = a;
		System.out.println(b);
		}
}

/*
  Se observa por pantalla Pre Incremero = 6 y Post Incremento = 5,
la diferencia entre una y la otra es que a la variable preIncremento
tiene el ++ adelante, lo que hace que se incremente en el momento y se
muestre su resultado incrementado, en cambio en la variable 
postIncremento el ++ aparece al final entonces la variable se muestra 
con el valor actual y luego se incrementa, lo podemos comprobar 
imprimiendo por pantalla nuevamente la variable postIncremento,
el resultado será 6. 
 */


