package bau.ejercicio7;

public class Circulo implements Figura2D{
	private double radio;
	private double diametro;

	public Circulo(double radio) {
		this.radio = radio;
		this.diametro = this.CalcularDiamentro();
	}
	
	
	public Circulo() {
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
		this.diametro = this.CalcularDiamentro();
	}


	public double getDiametro() {
		return diametro;
	}


	public void setDiametro(double diamentro) {
		this.diametro = diamentro;
		this.radio = this.diametro/Math.PI;
	}


	private double CalcularDiamentro() {
		return this.getRadio()*2;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2); 
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
}
