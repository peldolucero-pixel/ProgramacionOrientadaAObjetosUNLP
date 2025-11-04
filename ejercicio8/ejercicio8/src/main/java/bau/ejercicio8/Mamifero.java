package bau.ejercicio8;
import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaDeNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	
	public Mamifero() {
		this.madre = null;
		this.padre = null;
	}
	
	
	public Mamifero(String identificador, String especie, LocalDate fechaDeNacimiento) {
		this.identificador = identificador;
		this.especie = especie;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.madre = null;
		this.padre = null;
	}

	
	public Mamifero(String identificador) {
		this.identificador = identificador;
		this.madre = null;
		this.padre = null;
	}


	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloPaterno() {
		Mamifero abu = null;
		if (this.getPadre() !=null)
			abu = this.getPadre().getPadre();
		return abu;
	}
	
	public Mamifero getAbueloMaterno() {
		Mamifero abu = null;
		if (this.getMadre() != null)
			abu = this.getMadre().getPadre();
		return abu;	
	}
	
	public Mamifero getAbuelaPaterna() {
		Mamifero abu = null;
		if (this.getPadre() != null)
			abu = this.getPadre().getMadre();
		return abu;
	}
	
	public Mamifero getAbuelaMaterna() {
		Mamifero abu = null;
		if (this.getMadre() != null)
			abu = this.getMadre().getMadre();
		return abu;
	}
	
	public boolean tienePadre() {
		return this.getPadre() != null;
	}
	
	public boolean tieneMadre() {
		return this.getMadre() != null;
	}
	public boolean tieneComoAncestroA(Mamifero unMamifero){
		return (this.tienePadre() && (this.getPadre().equals(unMamifero)|| this.getPadre().tieneComoAncestroA(unMamifero)))||
				(this.tieneMadre()&& (this.getMadre().equals(unMamifero)|| this.getMadre().tieneComoAncestroA(unMamifero)));
				
	}
}
