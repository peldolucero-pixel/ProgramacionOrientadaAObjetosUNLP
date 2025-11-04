package bau.ejercicio15;

import java.util.List;
import java.util.ArrayList;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public List<Archivo> getAdjuntos() {
		return adjuntos;
	}
	public void addAdjuntos(Archivo archivo) {
		this.adjuntos.add(archivo);
	}
	
	public boolean contengoEstaCadena(String text) {
		return (this.titulo == text)||(this.cuerpo == text);
	}
	
	public int getTamaño() {
		int tamaño = this.titulo.length() + this.cuerpo.length();
		tamaño += this.adjuntos.stream()
				.mapToInt(archivo -> archivo.tamaño())
				.sum();
		return tamaño;
	}
	
}
