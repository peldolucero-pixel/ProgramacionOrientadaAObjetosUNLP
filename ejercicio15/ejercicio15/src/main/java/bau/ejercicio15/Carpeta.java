package bau.ejercicio15;

import java.util.List;
import java.util.ArrayList;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void addEmail(Email email) {
		this.emails.add(email);
	}
	
	public void deleteEmail(Email email) {
		this.emails.remove(email);
	}
	
	public void mover(Email email, Carpeta carpeta) {
		this.emails.remove(email);
		carpeta.addEmail(email);
	}
	
	public Email buscarMail(String text) {
		return this.emails.stream()
			.filter(email-> email.contengoEstaCadena(text))
			.findFirst().orElse(null);
	}
	
	public int espacioOcupado() {
		return this.nombre.length() + this.emails.stream()
									.mapToInt(email-> email.getTamaño())
									.sum();
	}
}
