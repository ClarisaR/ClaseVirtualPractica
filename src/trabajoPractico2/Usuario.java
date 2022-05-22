package trabajoPractico2;

public class Usuario {
	private String nombreDeUsuario;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	private boolean claveBloqueada;


	public Usuario(String nombreDeUsuario, String contrasenia, String nombre, String apellido, int dni, int edad){
		this.nombreDeUsuario = nombreDeUsuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.claveBloqueada = false;
	}
	
	
	public String getUsuario() {
		return nombreDeUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
