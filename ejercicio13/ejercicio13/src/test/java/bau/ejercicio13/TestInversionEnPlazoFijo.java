package bau.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class TestInversionEnPlazoFijo {
	InversionEnPlazoFijo inv;
	
	@BeforeEach
	void setUp() throws Exception{
		inv = new InversionEnPlazoFijo();
	}
	
	@Test
	public void testGetValorActual() {
		inv.setFechaDeCreacion(LocalDate.of(2025, 9, 25));
		inv.setMontoDepositado(500);
		inv.setPorcentajeDeInteres(1);
		assertEquals(inv.getValorActual(),16000);
	}
}
