package bau.ejercicio13;

public class InversionEnAcciones extends Inversion {
	private String nombre;
	private double cantidadDeAcciones; 
	private double precioUnitario;
	
	public InversionEnAcciones(String nombre) {
		this.nombre = nombre;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidadDeAcciones() {
		return cantidadDeAcciones;
	}

	public void setCantidadDeAcciones(double cantidadDeAcciones) {
		this.cantidadDeAcciones = cantidadDeAcciones;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	public double getValorActual() {
		return this.cantidadDeAcciones * this.precioUnitario;
	}
}
