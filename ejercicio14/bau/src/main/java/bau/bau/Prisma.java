package bau.bau;

public class Prisma extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	public Prisma(double ladoMayor, double ladoMenor, double altura) {
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	public double getLadoMayor() {
		return ladoMayor;
	}
	public void setLadoMayor(double ladoMayor) {
		this.ladoMayor = ladoMayor;
	}
	public double getLadoMenor() {
		return ladoMenor;
	}
	public void setLadoMenor(double ladoMenor) {
		this.ladoMenor = ladoMenor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double getVolumen() {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}
	@Override
	public double getSuperficie() {
		return 2*(this.ladoMayor * this.ladoMenor + this.ladoMayor * this.altura + this.ladoMenor * this.altura);
	}
	
	

}
