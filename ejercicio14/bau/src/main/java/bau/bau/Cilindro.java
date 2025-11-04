package bau.bau;

public class Cilindro extends Pieza {
	private double altura;
	private double radio;

	public Cilindro(double altura, double radio) {
		this.altura = altura;
		this.radio = radio;
	}

	public Cilindro() {
	}
	
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double getVolumen() {
		return Math.PI*Math.pow(radio, 2) * this.altura;
	}

	@Override
	public double getSuperficie() {
		return 2*this.radio* this.altura + 2 *Math.PI * Math.pow(radio, 2);
	}
	
	
	
}
