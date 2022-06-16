package trabajoPractico6;

public class Tornillo {
	private final TipoDeCabeza TIPO_DE_CABEZA;
	private final int LONGITUD;
	private final int CANTIDAD_DE_ROSCA;
	private int posicionActual;

	public int getPosicionActual() {
		return posicionActual;
	}

	public Tornillo(TipoDeCabeza tipoDeCabeza, int longitud, int cantidadDeRoscas) {
		this.TIPO_DE_CABEZA = tipoDeCabeza;
		this.LONGITUD = longitud;
		this.CANTIDAD_DE_ROSCA = cantidadDeRoscas;
		this.posicionActual = 0;
	}

	public int getLongitud() {
		return this.LONGITUD;
	}

	public TipoDeCabeza getTipoDeCabeza() {
		return this.TIPO_DE_CABEZA;
	}

	public boolean girar(SentidoDeGiro sentidoDeGiro) {
		boolean sePudoGirar = false;

		switch (sentidoDeGiro) {
			case HORARIO: {
				if (posicionActual < CANTIDAD_DE_ROSCA) {
					posicionActual++;
					sePudoGirar = true;
				} else {
					sePudoGirar = false;
				}
				break;
			}
	
			case ANTIHORARIO: {
				if (this.posicionActual > 0) {
					posicionActual--;
					sePudoGirar = true;
				} else {
					sePudoGirar = false;
				}
				break;
			}
			default: {
				sePudoGirar = false;
			}
		}
		return sePudoGirar;
	}
}
