package trabajoPractico2;

public class PruebaAlumno {

	public static void main(String[] args) {
		Alumno agustina= new Alumno();
		agustina.setNombre("Agustina");
		agustina.setNota1(7.0F);
		agustina.setNota2(8.5F);
		System.out.println("El promedio del alumno "+agustina.getNombre() + " es :"+agustina.calcularElPromedio());
		
	}

}
