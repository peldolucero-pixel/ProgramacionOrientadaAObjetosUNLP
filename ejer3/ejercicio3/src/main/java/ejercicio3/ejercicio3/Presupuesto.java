package ejercicio3.ejercicio3;
import java.time.LocalDate;
import java.util.ArrayList;
public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items;
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		double costo = this.items.stream()
				.mapToDouble(i->i.costo())
				.sum();
		return costo;
	}
}
