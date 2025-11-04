package bau.ejer21;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private List<Envio> envios;
	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.envios =new ArrayList<Envio>();
	}
	
	public void agregarEnvio(Envio envio) {
		this.envios.add(envio);
	}
	
	public double calcularMontoEnPerido(LocalDate inicio, LocalDate fin) {
		return envios.stream()
			.filter(envio -> envio.getFecha().isBefore(fin) && envio.getFecha().isAfter(inicio))
			.mapToDouble(envio -> envio.calcularCosto())
			.sum();
	}
	
	
}
