package bau.ejer21;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;

public class TestEnvioLocal {
	Envio envio;
	
	@BeforeEach
	void setUp() throws Exception{
		envio = new EnvioLocal(LocalDate.now(),"formosa", "la pampa", 500);
	}
	
	@Test
	public void testCalcularCosto() {
		assertEquals(envio.calcularCosto(),1000);
		envio.setEntregaRapida(true);
		assertEquals(envio.calcularCosto(),1500);
	}
}
