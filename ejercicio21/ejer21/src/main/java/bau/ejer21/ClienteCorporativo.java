package bau.ejer21;

import java.time.LocalDate;

public class ClienteCorporativo extends Cliente {
	private int cuit;

	public ClienteCorporativo(String nombre, String direccion, int cuit) {
		super(nombre, direccion);
		this.cuit = cuit;
	}
	
	@Override
	public double calcularMontoEnPerido(LocalDate inicio, LocalDate fin) {
		return super.calcularMontoEnPerido(inicio, fin);
	}
	
}
