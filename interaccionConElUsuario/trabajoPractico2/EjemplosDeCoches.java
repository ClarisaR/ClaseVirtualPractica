package trabajoPractico2;

public class EjemplosDeCoches {

	public static void main(String[] args) {
		
		Coche coche1=new Coche("Toyota", "Corolla 2.0",3700000.00);
		System.out.println("Precio: "+coche1.getPrecio());
		System.out.println("Antiguedad: "+coche1.calcularAntiguedad()+" anios");
		coche1.setKilometrosActuales(100);
		System.out.println("Kilometros actuales: "+coche1.getKilometros()+" KM");
		coche1.setPrecio(4000000.00);
		System.out.println("Nuevo precio: "+coche1.getPrecio());
		
		Coche coche2 = new Coche("Fiat","Cronos", 1000, 2018, 2500000.00);
		System.out.println("Kilometros actuales: "+coche2.getKilometros()+"KM");
		System.out.println("Antiguedad: "+coche2.calcularAntiguedad()+" anios");
		
		System.out.println("Cantidad de coches: "+Coche.getCantidadCoches());
	}

}
