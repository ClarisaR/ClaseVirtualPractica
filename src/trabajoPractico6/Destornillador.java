package trabajoPractico6;

public class Destornillador {
	private TipoDeCabeza tipoDeCabeza;
	
	
	public Destornillador(TipoDeCabeza tipoDeCabeza){
		this.tipoDeCabeza = tipoDeCabeza;
	}
	
	public void desatornillar(Tornillo tornilloActual) {
		boolean sePuedeSeguir = true;
		
		if (tornilloActual.getTipoDeCabeza()==this.tipoDeCabeza) {
			while(sePuedeSeguir) {
				sePuedeSeguir = tornilloActual.girar(SentidoDeGiro.ANTIHORARIO);
			}
		}
	}
	public void desatornillar(Tornillo tornilloActual, Tarugo tarugoActual) {
		boolean sePuedeSeguir = true;
		
		if (tornilloActual.getTipoDeCabeza()==this.tipoDeCabeza && tornilloActual.getLongitud()==tarugoActual.getLongitud()) {
			while(sePuedeSeguir) {
				sePuedeSeguir = tornilloActual.girar(SentidoDeGiro.ANTIHORARIO);
			}
		}
	}
	
	public void atornillar(Tornillo tornilloActual) {
		boolean sePuedeSeguir = true;
		
		if (tornilloActual.getTipoDeCabeza()==this.tipoDeCabeza) {
			while(sePuedeSeguir) {
				sePuedeSeguir = tornilloActual.girar(SentidoDeGiro.HORARIO);
			}
		}
	}
	

	public void atornillar(Tornillo tornilloActual, Tarugo tarugoActual) {
		boolean sePuedeSeguir = true;
		
		if (tornilloActual.getTipoDeCabeza()==this.tipoDeCabeza && tornilloActual.getLongitud()==tarugoActual.getLongitud()) {
			while(sePuedeSeguir) {
				sePuedeSeguir = tornilloActual.girar(SentidoDeGiro.HORARIO);
			}
		}
	}
}
