package trabajoPractico4;

public class Letra {
	private char letra;
	
	
	
	public Letra(char letra) {
		this.letra = letra;
	}

	public boolean esVocal() {
		switch (this.letra) {
		case 'a': {
			return true;
		}
		case 'e': {
			return true;
		}
		case 'i': {
			return true;
		}
		case 'o': {
			return true;
		}
		case 'u': {
			return true;
		}
		default:
			return false;
		}
	}
}
