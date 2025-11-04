package bau.ejer11;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestCuentaCorriente {
	CuentaCorriente cuentaCorriente;
	
	@BeforeEach
	void setUp() throws Exception{
		cuentaCorriente = new CuentaCorriente();
	}
	
	@Test
	public void testAsignacionDeLimiteDeDescubierto(){
		assertEquals(cuentaCorriente.getLimiteDeDescubierto(),0);
		cuentaCorriente.setLimiteDeDescubierto(500);
		assertEquals(cuentaCorriente.getLimiteDeDescubierto(),500);
		cuentaCorriente.setLimiteDeDescubierto(-100);
		assertEquals(cuentaCorriente.getLimiteDeDescubierto(),0);
	}
	
	@Test
	public void testLimitePorDefecto() {
		cuentaCorriente.setLimiteDeDescubierto(100);
		cuentaCorriente.depositar(200);;
		assertFalse(cuentaCorriente.extraer(500));
		assertTrue(cuentaCorriente.extraer(250));
	}
}
