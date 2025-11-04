package bau.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Inversionista {
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversionista(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public boolean eliminarInversion(Inversion inversion) {
		return this.inversiones.remove(inversion);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Inversion> getInversiones() {
		return inversiones;
	}

	public void setInversiones(List<Inversion> inversiones) {
		this.inversiones = inversiones;
	}

	public void agregarInversion(Inversion inversion) {
		this.inversiones.add(inversion);
	}
	
	public double getValorActual() {
		return this.inversiones.stream()
				.mapToDouble(i -> i.getValorActual())
				.sum();
	}
	
}
