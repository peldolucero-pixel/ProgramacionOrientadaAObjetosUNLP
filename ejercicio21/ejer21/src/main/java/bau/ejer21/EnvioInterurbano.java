package bau.ejer21;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio {
	private double distancia;

	public EnvioInterurbano(LocalDate fecha, String direccionDeOrigen, String direccionDeDestino, double pesoDePaquete,
			double distancia) {
		super(fecha, direccionDeOrigen, direccionDeDestino, pesoDePaquete);
		this.distancia = distancia;
	}
	
	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		if (this.distancia <  0) 
			this.distancia = 0;
		else
			this.distancia = distancia;
	}

	@Override
	public double calcularCosto() {
		return (this.distancia < 100? 20*super.getPesoDePaquete():
				this.distancia < 500? 25*super.getPesoDePaquete():
				30*super.getPesoDePaquete());
	}
	
	

}
