package bau.ejercicio16;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DataLapse {
	private LocalDate from;
	private LocalDate to; 
	
	public DataLapse(LocalDate from, LocalDate to) {
		if (from.isBefore(to)){
			this.from = from;
			this.to = to;
		}
		else {
			this.to = from; 
			this.from = to;
		}
	}
	
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	

	public int sizeInDays() {
		return (int) this.from.until(this.to,ChronoUnit.DAYS);
	}
	
	public boolean includesDate(LocalDate date) {
		return ((this.from.isBefore(date) && this.to.isAfter(date))||
				this.from.isEqual(date)|| this.to.isEqual(date));
	}
}
