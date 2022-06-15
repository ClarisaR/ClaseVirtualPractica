package trabajoPractico6;

public class Destornillador {
	private TipoDeCabeza tipoDeCabeza;
	
	
	public Destornillador(TipoDeCabeza tipoDeCabeza){
		this.tipoDeCabeza = tipoDeCabeza;
	}
	
	public boolean desatornillar(Tornillo tornilloActual) {
		boolean sePuedeSeguir = true;
		
		if (tornilloActual.getTipoDeCabeza()==this.tipoDeCabeza) {
			while(sePuedeSeguir) {
				sePuedeSeguir = tornilloActual.girar(Sentido.ANTIHORARIO);
			}
		}
		return false;
	}
	
	public void atornillar(Tornillo tornilloActual) {
		boolean sePuedeSeguir = true;
		
		if (tornilloActual.getTipoDeCabeza()==this.tipoDeCabeza) {
			while(sePuedeSeguir) {
				sePuedeSeguir = tornilloActual.girar(Sentido.HORARIO);
			}
		}
	}
}
