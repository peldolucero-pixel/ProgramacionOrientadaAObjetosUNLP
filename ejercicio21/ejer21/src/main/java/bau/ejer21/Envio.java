package bau.ejer21;

import java.time.LocalDate;

public abstract class Envio {
	private LocalDate fecha;
	private String direccionDeOrigen;
	private String direccionDeDestino;
	private boolean entregaRapida;
	private double pesoDePaquete;
	
	
	//**constructor //
	public Envio(LocalDate fecha, String direccionDeOrigen, String direccionDeDestino, double pesoDePaquete) {
		this.fecha = fecha;
		this.direccionDeOrigen = direccionDeOrigen;
		this.direccionDeDestino = direccionDeDestino;
		this.pesoDePaquete = pesoDePaquete;
		this.entregaRapida = false; 
	}
	
	
	public abstract double calcularCosto();

	public LocalDate getFecha() {
		return fecha;
	}

	public double getPesoDePaquete() {
		return pesoDePaquete;
	}

	public boolean isEntregaRapida() {
		return entregaRapida;
	}

	public void setEntregaRapida(boolean entregaRapida) {
		this.entregaRapida = entregaRapida;
	}
	
}
