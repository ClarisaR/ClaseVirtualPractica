package trabajoPractico3;

public class Persona {
	
	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private int edad;
	private boolean viva;
	private double altura;
	
	public Persona(String nombre, String genero, long dni, double peso, double altura){
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.edad = 0;
		this.viva = true;
		this.altura = altura;
	}

	
	public void alimentar(double kilos){
		this.peso= this.peso + kilos;
	}
	public void crecer(double metros){
		this.altura= this.altura + metros;
	}
	public void cumplirAnios(){
		this.edad++;
	}
	public void morir(){
		this.viva = false;
	}
	public double pesar(){
		return this.peso;
	}
	public double medir(){
		return this.altura;
	}
	
	public double devolverAltura(){
		return this.altura;
	}
	public double devolverPeso(){
		return this.peso;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public boolean esMayorDeEdad(){
		if (this.edad>=18){
			return true;
		}
		else{
			return false;
		}
	}
	
}