package trabajoPractico2;

public class PruebaUsuario {

	public static void main(String[] args) {
		Usuario nuevoUsuario = new Usuario("ClarisaR", "123456ABC", "Clarisa", "Rodriguez", 94432731,25);
		
		nuevoUsuario.setContrasenia("ABC123456");
		System.out.println("El usuario es: "+nuevoUsuario.getUsuario());
		
	}
}
 