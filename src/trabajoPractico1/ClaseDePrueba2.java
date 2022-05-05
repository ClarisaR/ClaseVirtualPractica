package trabajoPractico1;
public class ClaseDePrueba2 {

	public static void main(String[] args) {
		int capacidadHdd = 1;
		double capacidadDvd = 8.5;
		double capacidadBlueRay = 25.0;
		double cantidadDeDvdsParaBackupearHdd;
		double cantidadBlueRaysParaBackupearHdd;
		
		int conversionDeUnidad = 1024;
		
		cantidadDeDvdsParaBackupearHdd = ((capacidadHdd+conversionDeUnidad)/capacidadDvd);
		cantidadBlueRaysParaBackupearHdd = ((capacidadHdd+conversionDeUnidad)/capacidadBlueRay);
		
		int  cantidadDeDvdsParaBackupearHddEntero = (int)Math.ceil(cantidadDeDvdsParaBackupearHdd);
		int   cantidadBlueRaysParaBackupearHddEntero = (int)Math.ceil(cantidadBlueRaysParaBackupearHdd);
		
		System.out.println("Cantidad de DVD que se necesita para backupear el disco rigido: "+cantidadDeDvdsParaBackupearHddEntero);
		System.out.println("Cantidad de Blue Ray que se necesita para backupear el disco rigido: "+cantidadBlueRaysParaBackupearHddEntero);
	}

}

/*
  Las modificaciones que realizamos para corregir errores fue cambiar 
de tipo de int a double las variables cantidadDeDvdsParaBackupearHdd y
cantidadBlueRaysParaBackupearHdd, ya que, al asignarle una operacion 
daba un resultado con coma.
 El resultado es correcto pero como es cantidad de dvd y blue ray
 deberian ser numeros enteros. 
 Para readondear los numeros utilizamos el método ceil de la clase Math
 y los convertimos en numeros enteros cambiando el tipo de double a int. 
 */

