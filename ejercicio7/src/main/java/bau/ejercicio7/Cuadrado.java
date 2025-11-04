package bau.ejercicio7;

public class Cuadrado implements Figura2D{
	private double lado;

	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	
	public Cuadrado() {
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public double getPerimetro() {
		return this.getLado()* 4;
	}
	
	public double getArea() {
		return this.getLado() *this.getLado();
	}
}
