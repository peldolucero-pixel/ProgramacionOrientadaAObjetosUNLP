package bau.ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;
public class DataLapseTest {
	
	DataLapse lapso;
	@BeforeEach
	void setUp() throws Exception{
		LocalDate from = LocalDate.of(2025, 10, 12);
		LocalDate to = LocalDate.of(2025, 12, 30);
		lapso = new DataLapse(from,79);
	}
	
	@Test
	public void testSizeInDays() {
		assertEquals(lapso.sizeInDays(),79);
	}
	
	@Test
	public void testGetTo() {
		assertEquals(lapso.getTo(),LocalDate.of(2025, 12, 30));
	}
	
	@Test
	public void testIncluidesDate() {
		assertTrue(lapso.includesDate(LocalDate.of(2025, 11, 1)));
		assertFalse(lapso.includesDate(LocalDate.of(2024, 11, 1)));
		assertTrue(lapso.includesDate(lapso.getFrom()));
		assertTrue(lapso.includesDate(lapso.getTo()));
	}
	
}
