package trabajoPractico2;
//Implementamos la clase coche
public class Coche {
	
	//Atributos
	private final int CERO_KM = 0;
	private final int ANIO_ACTUAL = 2022;
	private static int cantidadDeCoches = 0;
	private String marca;
	private String modelo;
	private int kilometrosActuales;
	private int anioDeFabricacion;
	private double precio;
	
	//Constructores
	public Coche(String marca, String modelo, double precio){
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.anioDeFabricacion = this.ANIO_ACTUAL;
		cantidadDeCoches++;
	}
	public Coche(String marca, String modelo,int kilometros, int anio, double precio){
		this.marca = marca;
		this.modelo = modelo;
		kilometrosActuales = kilometros;
		anioDeFabricacion = anio;
		this.precio = precio;
		cantidadDeCoches++;
	}
	
	//Metodos
	public static int getCantidadCoches() {
		return cantidadDeCoches;
	}
	public void setKilometrosActuales(int kilometros){
		kilometrosActuales = kilometros;
	}
	public void setPrecio(double precio){
		this.precio = precio;
	}
	public double getPrecio(){
		return precio;
	}
	public int calcularAntiguedad(){
		int antiguedad;
		antiguedad = ANIO_ACTUAL - anioDeFabricacion;
		return antiguedad;
	}
	public int getKilometros(){
		return kilometrosActuales;
	}
}
