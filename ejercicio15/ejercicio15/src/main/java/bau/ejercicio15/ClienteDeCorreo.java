package bau.ejercicio15;

import java.util.List;
import java.util.ArrayList;

public class ClienteDeCorreo {
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		carpetas = new ArrayList<Carpeta>();	
		Carpeta inbox = new Carpeta("inbox");
		carpetas.add(1, inbox);
	}
	public void recibir(Email email) {
		carpetas.get(1).addEmail(email);
	}
	
	public Email buscar(String text) {
		return this.carpetas.stream()
				.map(carpeta-> carpeta.buscarMail(text))
				.filter(email-> email != null)
				.findFirst().orElse(null);
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream()
				.mapToInt(carpeta-> carpeta.espacioOcupado())
				.sum();
	}
}
