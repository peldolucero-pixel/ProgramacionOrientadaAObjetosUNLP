package bau.ejercicio7;

public class Cuerpo3D {
	private double altura;
	private Figura2D caraBasal;

	public Cuerpo3D(double altura,Figura2D figura) {
		this.altura = altura;
		this.caraBasal = figura;
	}
	
	public Cuerpo3D() {
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Figura2D getCaraBasal() {
		return caraBasal;
	}

	public void setCaraBasal(Figura2D caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen() {
		return this.getCaraBasal().getArea()* this.getAltura();
	}
	
	public double getSuperficieExterior() {
		return 2* this.getCaraBasal().getArea()+ this.getCaraBasal().getPerimetro() * this.getAltura();
	}
}
