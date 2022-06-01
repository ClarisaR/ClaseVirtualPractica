package trabajoPractico4;

public class Motor {
	public final static int BOMBA_NO_DEFINIDA = 0;
	public final static int BOMBA_DE_AGUA = 1;
	public final static int BOMBA_DE_GASOLINA = 2;
	public final static int BOMBA_DE_HORMIGON = 3;
	public final static int BOMBA_DE_PASTA_ALIMENTICIA = 4;
	private int tipoBomba;
	private String tipoFluido;
	private String combustible;
	
	public Motor(int tipoBomba, String tipoFluido, String combustible) {
		super();
		this.tipoBomba = tipoBomba;
		this.tipoFluido = tipoFluido;
		this.combustible = combustible;
	}


	public int getTipoBomba() {
		return tipoBomba;
	}

	public void setTipoBomba(int tipoBomba) {
		this.tipoBomba = tipoBomba;
	}

	public String getTipoFluido() {
		return tipoFluido;
	}

	public void setTipoFluido(String tipoFluido) {
		this.tipoFluido = tipoFluido;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	public String dimeTipoDeMotor() {
		switch (this.tipoBomba) {
		case BOMBA_NO_DEFINIDA: {
			return "No hay establecido un valor definitivo para el tipo de bomba";
		}
		case BOMBA_DE_AGUA: {
			return "La bomba es una bomba de agua";
		}
		case BOMBA_DE_GASOLINA: {
			return "La bomba es una bomba de gasolina";
		}
		case BOMBA_DE_HORMIGON: {
			return "La bomba es una bomba de hormigon";
		}
		case BOMBA_DE_PASTA_ALIMENTICIA: {
			return "La bomba es una bomba de pasta alimenticia";
		}
		default:
			return "No existe un valor valido para tipo de bomba";
		}
	}
	
}
