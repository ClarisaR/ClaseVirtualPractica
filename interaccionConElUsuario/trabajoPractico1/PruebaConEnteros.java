package trabajoPractico1;
//Ejercicio 2
public class PruebaConEnteros {

	public static void main(String[] args) {
		//punto a
		int numeroEntero = 2147483647;

		//punto b
		System.out.println(numeroEntero);
		
		//punto c
		//cambios que haria
		long numeroLong = numeroEntero;
		numeroLong++;
		
		//punto d
		System.out.println(numeroLong);
		
		
	}
}

/*punto e
  Cuando incremento la variable numeroEntero, e imprimo por pantalla,
muestra el número -2147483648. Esto sucede, ya que, el numero 2147483647 se 
representa en binario con el primer bit en 0 (primer bit en 0 = signo +)y los 31 bits
restantes en 1; al incrementar se realiza una suma binaria, la cual produce un acarreo
de 1 bit desde el bit menos significativo, al más significativo, esto da como 
resultado el primer bit en 1 (primer bit en 1 = signo -) y los 31 bits restantes
en 0. 
Como los numeros negativos se almacenan complementados, los 31 ceros son en realidad
31 unos, lo cual da el numero negativo más pequeño que se puede representar en una 
variable de tipo int.


  Los cambios que realizaría si quisiera incrementar el numero, es cambiar 
 la variable de tipo int a una de tipo long, en donde se podra almacenar 
 numeros mayores a 2147483647.
*/