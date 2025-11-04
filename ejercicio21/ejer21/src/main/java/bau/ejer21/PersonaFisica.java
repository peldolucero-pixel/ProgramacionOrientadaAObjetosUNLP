package bau.ejer21;

import java.time.LocalDate;

public class PersonaFisica extends Cliente{
	private int dni;
	private double DESCUENTO = 0.10;
	
	public PersonaFisica(String nombre, String direccion, int dni) {
		super(nombre, direccion);
		this.dni = dni;
	}
	
	@Override
	public double calcularMontoEnPerido(LocalDate inicio, LocalDate fin) {
		double monto = super.calcularMontoEnPerido(inicio, fin);
		return monto - monto* this.DESCUENTO;
	}
}
