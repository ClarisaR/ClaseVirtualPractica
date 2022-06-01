package trabajoPractico4;

public class Dia {
	
	public static String elNombreEs(int numeroDeDia) {
		
		String nombreDelDia = "";
		
		switch (numeroDeDia) {
		case 1: {
			nombreDelDia = "Domingo";
			break;
		}
		case 2: {
			nombreDelDia ="Lunes";
			break;
		}
		case 3: {
			nombreDelDia = "Martes";
			break;
		}
		case 4: {
			nombreDelDia = "Miercoles";
			break;
		}
		case 5: {
			nombreDelDia = "Jueves";
			break;
		}
		case 6: {
			nombreDelDia = "Viernes";
			break;
		}
		case 7: {
			nombreDelDia = "Sabado";
			break;
		}
		default:
			nombreDelDia = "Numero de dia inexistente";
		}
		return nombreDelDia;
	}
	
}
