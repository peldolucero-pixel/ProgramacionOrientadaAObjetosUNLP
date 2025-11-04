package bau.ejer11;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestCajaDeAhorro {
	CajaDeAhorro cajaDeAhorro;
	
	@BeforeEach
	void setUp() throws Exception {
		cajaDeAhorro = new CajaDeAhorro();
	}
	
	@Test
	public void testDepositar() {
		cajaDeAhorro.depositar(10000);
		assertEquals(cajaDeAhorro.getSaldo(),9800);
		assertNotEquals(cajaDeAhorro.getSaldo(),101);
	}
	@Test
	public void testExtraer() {
		cajaDeAhorro.depositar(10000);
		assertTrue(cajaDeAhorro.extraer(1000));
		assertEquals(cajaDeAhorro.getSaldo(),8780);
		assertFalse(cajaDeAhorro.extraer(10000));
	}
	
	@Test
	public void testTrasferirAOtraCuenta() {
		Cuenta otraCaja = new CajaDeAhorro();
		cajaDeAhorro.depositar(10000);
		assertTrue(cajaDeAhorro.transferirACuenta(1000, otraCaja));
		assertEquals(cajaDeAhorro.getSaldo(),8780);
		assertEquals(otraCaja.getSaldo(),980);
		assertFalse(cajaDeAhorro.transferirACuenta(10000, otraCaja));
	}
}
