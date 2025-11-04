package bau.ejercicio17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DataLapse {
	private LocalDate from;
	private int sizeInDate; 
	
	public DataLapse(LocalDate from, int sizeInDate) {
			this.from = from;
			this.sizeInDate = sizeInDate;
	}
	
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.from.plusDays(sizeInDate);
	}
	

	public int sizeInDays() {
		return this.sizeInDate;
	}
	
	public boolean includesDate(LocalDate date) {
		return ((this.from.isBefore(date) && this.getTo().isAfter(date))||
				this.from.isEqual(date)|| this.getTo().isEqual(date));
	}
}
