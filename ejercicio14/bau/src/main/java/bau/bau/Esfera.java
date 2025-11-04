package bau.bau;

public class Esfera extends Pieza{
	private double radio;
	
	public Esfera() {
	}

	public Esfera(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double getVolumen() {
		return (4/3)* Math.PI * Math.pow(radio, 3);
	}

	@Override
	public double getSuperficie() {
		return 4* Math.PI * Math.pow(radio, 2);
	}
	
	
}
