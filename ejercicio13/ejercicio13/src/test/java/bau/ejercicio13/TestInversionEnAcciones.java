package bau.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestInversionEnAcciones {

	InversionEnAcciones inv; 
	
	@BeforeEach
	void setUp() throws Exception{
		inv = new InversionEnAcciones("google");
	}
	@Test
	void testGetValorActual() {
		inv.setCantidadDeAcciones(15);
		inv.setPrecioUnitario(100);
		assertEquals(inv.getValorActual(),1500);
	}
}
