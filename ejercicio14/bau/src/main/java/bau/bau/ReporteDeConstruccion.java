package bau.bau;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>(); 
	}
	
	public void addPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public double volumenDeMaterial(String material) {
		return this.piezas.stream()
				.filter(pieza-> pieza.getMaterial() == material)
				.mapToDouble(pieza -> pieza.getVolumen())
				.sum();
	}
	
	public double superficieDeColor(String color) {
		return this.piezas.stream()
				.filter(pieza-> pieza.getColor() == color)
				.mapToDouble(pieza -> pieza.getSuperficie())
				.sum();
	}
}
