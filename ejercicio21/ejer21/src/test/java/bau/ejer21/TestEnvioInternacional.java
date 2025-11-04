package bau.ejer21;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate; 
public class TestEnvioInternacional {
	EnvioInternacional envio;
	
	@BeforeEach
	void setUp() throws Exception{
		envio = new EnvioInternacional(LocalDate.now(),"formosa", "la pampa", 10);
	}
	
	@Test
	public void testCalcularCosto() {
		assertEquals(envio.calcularCosto(),5100);
		envio.setEntregaRapida(true);
		assertEquals(envio.calcularCosto(),5900);
	}
		
	
}
