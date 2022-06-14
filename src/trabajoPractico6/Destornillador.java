package trabajoPractico6;

public class Destornillador {
	private final char TIPO_DE_CABEZA;
	
	public static final char PLANA = 'P';
	public static final char PHILLIPS= 'H';
	public static final char ALLEN = 'A';
	
	public Destornillador(char tipoDeCabeza){
		this.TIPO_DE_CABEZA = tipoDeCabeza;
	}
	
	public boolean desatornillar(Tornillo tornillo) {
		if (tornillo.getTipoDeCabeza()==this.TIPO_DE_CABEZA) {
			return true;
		}
		return false;
	}
	
	public boolean atornillar(Tornillo tornillo) {
		if (tornillo.getTipoDeCabeza()==this.TIPO_DE_CABEZA) {
			return true;
		}
		return false;
	}
	
	public boolean atornillar(Tornillo tornillo, Tarugo tarugo) {
		if(tornillo.getLongitud()==tarugo.getLongitud() && tornillo.getTipoDeCabeza()==this.TIPO_DE_CABEZA) {
			return true;
		}
		return false;
	}
}
