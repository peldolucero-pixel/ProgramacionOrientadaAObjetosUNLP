package bau.ejercicio17;

import java.time.LocalDate;

public interface DataLapseInteface {

	public LocalDate getFrom();
	
	public LocalDate getTo();
	
	public int sizeInDays();

	public boolean includesDate(LocalDate date);
}
