package bau.ejercicio13;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InversionEnPlazoFijo extends Inversion {
	private LocalDate fechaDeCreacion;
	private double montoDepositado;
	private double porcentajeDeInteres;
	
	public InversionEnPlazoFijo() {
		
	}
	

	public InversionEnPlazoFijo(LocalDate fechaDeCreacion, double montoDepositado, double porcentajeDeInteres) {
		this.fechaDeCreacion = fechaDeCreacion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteres = porcentajeDeInteres;
	}


	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public double getMontoDepositado() {
		return montoDepositado;
	}

	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}

	public double getPorcentajeDeInteres() {
		return porcentajeDeInteres;
	}

	public void setPorcentajeDeInteres(double porcentajeDeInteres) {
		this.porcentajeDeInteres = porcentajeDeInteres;
	}


	@Override
	public double getValorActual() {
		Long dias = ChronoUnit.DAYS.between(fechaDeCreacion, LocalDate.now());
		double montoActual = this.montoDepositado;
		int i; 
		for (i = 0; i < dias; i++)
			montoActual+= montoActual * this.porcentajeDeInteres;
		return montoActual;
	}
	
}
