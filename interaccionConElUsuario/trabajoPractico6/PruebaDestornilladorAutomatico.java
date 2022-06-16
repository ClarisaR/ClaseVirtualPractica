package trabajoPractico6;

import java.util.Scanner;

public class PruebaDestornilladorAutomatico {
	private static final int CARGAR_DESTORNILLADOR = 1;
	private static final int SELECCIONAR_TORNILLO = 2;
	private static final int SELECCIONAR_TARUGO = 3;
	private static final int ATORNILLAR = 4;
	private static final int DESATORNILLAR = 5;
	private static final int SALIR = 6;
	
	public static void main(String[] args) {
		Destornillador destornilladorAutomatico = null;
		Tornillo tornillo = null;
		Tarugo tarugo = null;
		Scanner teclado = new Scanner(System.in);
		int opcionDeseada=0;
		System.out.println("***DESTORNILLADOR AUTOMATICO***");
		while(opcionDeseada != 6) {
			opcionDeseada = mostrarMenuHerramientas(teclado);
			
			switch (opcionDeseada) {
			case CARGAR_DESTORNILLADOR: {
				destornilladorAutomatico = cargarDestornillador(teclado);
				break;
			}
			case SELECCIONAR_TORNILLO: {
				tornillo = seleccionarTornillo(teclado);
				break;
			}
			case SELECCIONAR_TARUGO: {
				tarugo = seleccionarTarugo(teclado);
				break;
			}
			case ATORNILLAR:{
				atornillar(destornilladorAutomatico, tornillo, tarugo);
				break;
			}
			case DESATORNILLAR:{
				desatornillar(destornilladorAutomatico, tornillo);
				break;
			}
			case SALIR: {
				System.out.println("Destornillador apagado");
				break;
			}
			default:
				mostrarMensajeDeError("No existe la opcion ingresada");
			}
		}
		
		
	}

	private static void mostrarMensajeDeError(String mensaje) {
		System.out.println(mensaje);
	}

	private static void desatornillar(Destornillador destornilladorAutomatico, Tornillo tornillo) {
		boolean sePudoDesatornillar = destornilladorAutomatico.desatornillar(tornillo);
		if(sePudoDesatornillar) {
			mostrarPosicionDelTornillo(tornillo);
		}else {
			System.out.println("Los tipos de cabeza no coinciden");
			System.out.println("Destornillador: "+destornilladorAutomatico.getTipoDeCabeza());
			System.out.println("Tornillo: "+tornillo.getTipoDeCabeza());
		}
	}

	private static void atornillar(Destornillador destornilladorAutomatico, Tornillo tornillo, Tarugo tarugo) {
		if (tarugo==null) {
			atornillarSinTarugo(destornilladorAutomatico, tornillo);
		}else {
			atornillarConTarugo(destornilladorAutomatico, tornillo, tarugo);
		}
		 
		
	}

	private static void atornillarConTarugo(Destornillador destornilladorAutomatico, Tornillo tornillo, Tarugo tarugo) {
		boolean sePudoAtornillar;
		sePudoAtornillar = destornilladorAutomatico.atornillar(tornillo, tarugo);
		if(sePudoAtornillar) {
			mostrarPosicionDelTornillo(tornillo);
		}
		else {
			String mensajeDeError = "";
			if(destornilladorAutomatico.getTipoDeCabeza()!=tornillo.getTipoDeCabeza()) {
				mensajeDeError = mensajeDeError
						.concat("Los tipos de cabeza no coinciden\n")
						.concat("Destornillador: "+destornilladorAutomatico.getTipoDeCabeza())
						.concat("\nTornillo: "+tornillo.getTipoDeCabeza());
			}else {
				mensajeDeError = mensajeDeError
						.concat("Las longitudes no coinciden\n")
						.concat("Longitud tornillo: "+tornillo.getLongitud())
						.concat("\nLongitud tarugo: "+tarugo.getLongitud());
			}
			mostrarMensajeDeError(mensajeDeError);
		}
	}

	private static void atornillarSinTarugo(Destornillador destornilladorAutomatico, Tornillo tornillo) {
		boolean sePudoAtornillar;
		sePudoAtornillar = destornilladorAutomatico.atornillar(tornillo);
		if(sePudoAtornillar) {
			mostrarPosicionDelTornillo(tornillo);
		}else {
			String mensajeDeError = "";
			mensajeDeError = mensajeDeError
				.concat("Los tipos de cabeza no coinciden\n")
				.concat("Destornillador: "+destornilladorAutomatico.getTipoDeCabeza())
				.concat("\nTornillo: "+tornillo.getTipoDeCabeza());
			mostrarMensajeDeError(mensajeDeError);
		}
	}

	private static void mostrarPosicionDelTornillo(Tornillo tornillo) {
		System.out.println("La posicion actual del tornillo es: "+tornillo.getPosicionActual());
	}

	private static Tarugo seleccionarTarugo(Scanner teclado) {
		System.out.print("Ingrese longitud del tarugo: ");
		int longitudDelTarugo = teclado.nextInt();
		return new Tarugo(longitudDelTarugo);
	}

	private static Tornillo seleccionarTornillo(Scanner teclado) {
		System.out.print("Ingrese tipo de cabeza del tornillo (P/H/A): ");
		char tipoDeCabeza = teclado.next().toUpperCase().charAt(0);
		
		System.out.print("Ingrese longitud del tornillo: ");
		int longitudDelTornillo = teclado.nextInt();
		
		System.out.print("Ingrese cantidad de rosca: ");
		int cantidadDeRosca = teclado.nextInt();
		
		TipoDeCabeza tipoDeCabezaElegida = null;
		switch (tipoDeCabeza) {
		case 'P': {
			tipoDeCabezaElegida = TipoDeCabeza.PLANA;
			break;
		}
		case 'H': {
			tipoDeCabezaElegida = TipoDeCabeza.PHILLIPS;
			break;
		}
		case 'A': {
			tipoDeCabezaElegida = TipoDeCabeza.ALLEN;
			break;
		}
		default:
			System.out.println("No existe este tipo de cabeza");
		}
		
		return new Tornillo(tipoDeCabezaElegida, longitudDelTornillo, cantidadDeRosca);
	}

	private static Destornillador cargarDestornillador(Scanner teclado) {
		System.out.print("Ingrese tipo de cabeza (P/H/A): ");
		char tipoDeCabeza = teclado.next().toUpperCase().charAt(0);
		TipoDeCabeza tipoDeCabezaElegida = null;
		switch (tipoDeCabeza) {
		case 'P': {
			tipoDeCabezaElegida = TipoDeCabeza.PLANA;
			break;
		}
		case 'H': {
			tipoDeCabezaElegida = TipoDeCabeza.PHILLIPS;
			break;
		}
		case 'A': {
			tipoDeCabezaElegida = TipoDeCabeza.ALLEN;
			break;
		}
		default:
			System.out.println("No existe este tipo de cabeza");
		}
		
		return new Destornillador(tipoDeCabezaElegida);
	}

	private static int mostrarMenuHerramientas(Scanner teclado) {
		System.out.println("1-Cargar destornillador");
		System.out.println("2-Seleccionar nuevo tornillo");
		System.out.println("3-Seleccionar nuevo tarugo");
		System.out.println("4-Atornillar");
		System.out.println("5-Desatornillar");
		System.out.println("6-Salir");
		System.out.print("Opcion: ");
		int opcion = teclado.nextInt();
		return opcion;
	}

}
