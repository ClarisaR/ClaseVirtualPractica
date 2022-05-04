package trabajoPractico2;

public class Alumno {
	//atributos
	private String nombre;
	private float nota1;
	private float nota2;
	
	//metodos
	
	float calcularElPromedio(){
		float resultado = (nota1 + nota2)/2;
		return resultado;
	}
	public void setNombre (String valor) {
		nombre = valor;
	}
	public void setNota1 (float valor) {
		nota1 = valor;
	}
	public void setNota2 (float valor) {
		nota2 = valor;
	}
	public String getNombre() {
		return nombre;
	}
}
