package claseVirtual;

public class MyInteger {
	private final int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public MyInteger(String value) {
		this.value = Integer.parseInt(value);
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.value);
	}
}
