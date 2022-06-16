package trabajoPractico6;

public class Destornillador {
	private TipoDeCabeza tipoDeCabeza;
	
	
	public TipoDeCabeza getTipoDeCabeza() {
		return tipoDeCabeza;
	}

	public Destornillador(TipoDeCabeza tipoDeCabeza){
		this.tipoDeCabeza = tipoDeCabeza;
	}
	
	public boolean desatornillar(Tornillo tornilloActual) {
		boolean sePuedeSeguir = true;
		
		if (tornilloActual.getTipoDeCabeza()==this.tipoDeCabeza) {
			while(sePuedeSeguir) {
				sePuedeSeguir = tornilloActual.girar(SentidoDeGiro.ANTIHORARIO);
			}
			return true;
		}
		return false;
	}
	
	public boolean atornillar(Tornillo tornilloActual) {
		boolean sePuedeSeguir = true;
		
		if (tornilloActual.getTipoDeCabeza()==this.tipoDeCabeza) {
			while(sePuedeSeguir) {
				sePuedeSeguir = tornilloActual.girar(SentidoDeGiro.HORARIO);
			}
			return true;
		}
		return false;
	}
	

	public boolean atornillar(Tornillo tornilloActual, Tarugo tarugoActual) {
		boolean sePuedeSeguir = true;
		
		if (tornilloActual.getTipoDeCabeza()==this.tipoDeCabeza && tornilloActual.getLongitud()==tarugoActual.getLongitud()) {
			while(sePuedeSeguir) {
				sePuedeSeguir = tornilloActual.girar(SentidoDeGiro.HORARIO);
			}
			return true;
		}
		return false;
	}
}
