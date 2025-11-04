package bau.ejer21;

import java.time.LocalDate;

public class EnvioInternacional extends Envio {

	public EnvioInternacional(LocalDate fecha, String direccionDeOrigen, String direccionDeDestino,
			double pesoDePaquete) {
		super(fecha, direccionDeOrigen, direccionDeDestino, pesoDePaquete);
	}
	
	private double precioDelPeso() {
		return this.getPesoDePaquete() < 100? super.getPesoDePaquete() * 10:
			super.getPesoDePaquete()*12;
	}

	@Override
	public double calcularCosto() {
		return 5000 + this.precioDelPeso() + (this.isEntregaRapida()? 800:0);
	}
	

}
