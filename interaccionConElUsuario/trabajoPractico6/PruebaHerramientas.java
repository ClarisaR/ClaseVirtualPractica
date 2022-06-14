package trabajoPractico6;

import java.util.Scanner;

public class PruebaHerramientas {
	public static void main(String[] args) {
		
		Tornillo tornillo = new Tornillo(Tornillo.PLANA, 2, 5);
		
		Destornillador destornillador = new Destornillador(Destornillador.PHILLIPS);
		
		Tarugo tarugo = new Tarugo(5);
		
		if(destornillador.atornillar(tornillo)) {
			System.out.println("atornillando");
		}
		else {
			System.out.println("No se pudo atornillar. No coinciden los tipos de cabeza");
		}
	}
}
