package trabajoPractico4;

public class Dia {
	int numeroDeDia;

	public Dia(int numeroDeDia) {
		this.numeroDeDia = numeroDeDia;
	} 
	
	public String getDia() {
		switch (this.numeroDeDia) {
		case 1: {
			return "Domingo";
		}
		case 2: {
			return "Lunes";
		}
		case 3: {
			return "Martes";
		}
		case 4: {
			return "Miercoles";
		}
		case 5: {
			return "Jueves";
		}
		case 6: {
			return "Viernes";
		}
		case 7: {
			return "Sabado";
		}
		default:
			return "Numero de dia inexistente";
		}
	}
	
}
