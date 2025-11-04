package bau.ejer21;

import java.time.LocalDate;

public class EnvioLocal extends Envio {
	private double COSTOFIJO = 1000 ;
	
	public EnvioLocal(LocalDate fecha, String direccionDeOrigen, String direccionDeDestino, double pesoDePaquete) {
		super(fecha, direccionDeOrigen, direccionDeDestino, pesoDePaquete);
		
	}
	@Override
	public double calcularCosto() {
		return this.COSTOFIJO + (super.isEntregaRapida()?500:0);
	}
	
	
	
}
