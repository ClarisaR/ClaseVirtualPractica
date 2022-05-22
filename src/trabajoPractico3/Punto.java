package trabajoPractico3;

public class Punto {
	private double coordenadaEnX;
	private double coordenadaEnY;
	

	public Punto(double coordenadaEnX, double coordenadaEnY){
		this.coordenadaEnX = coordenadaEnX;
		this.coordenadaEnY = coordenadaEnY;
	}
	
	public double getCoordenadaEnX(){
		return this.coordenadaEnX ;
	}
	
	public void setCoordenadaEnX(double nuevaCoordenandaEnX){
		this.coordenadaEnX = nuevaCoordenandaEnX;
	}
	
	public double getCoordenadaEnY() {
		return coordenadaEnY;
	}

	public void setCoordenadaEnY(double nuevaCoordenadaEnY) {
		this.coordenadaEnY = nuevaCoordenadaEnY;
	}
	
	public boolean estaEnElEjeX(){
		if (this.coordenadaEnY == 0 && this.coordenadaEnX!=0){
			return true;
		}else {
			return false;
		}
	}
	public boolean estaEnElEjeY(){
		if (this.coordenadaEnX == 0 && this.coordenadaEnY!=0){
			return true;
		}else {
			return false;
		}
	}
	
	public boolean estaEnElOrigenDeLasCoordenadas(){
		if (this.coordenadaEnX == 0 && this.coordenadaEnY==0){
			return true;
		}else {
			return false;
		}
	}
	
}
