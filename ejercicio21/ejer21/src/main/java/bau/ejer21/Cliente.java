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
		DataLapse lapso = new DataLapse(inicio,fin);
		return envios.stream()
			.filter(envio -> lapso.includesDate(envio.getFecha()))
			.mapToDouble(envio -> envio.calcularCosto())
			.sum();
	}
	
	
}
