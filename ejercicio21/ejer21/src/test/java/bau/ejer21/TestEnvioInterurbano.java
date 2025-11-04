package bau.ejer21;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;
public class TestEnvioInterurbano {
	EnvioInterurbano envio;
	
	@BeforeEach
	void setUp() throws Exception{
		envio = new EnvioInterurbano(LocalDate.now(),"formosa", "la pampa", 50,10);
	}
	
	@Test
	public void testCalcularCosto() {
		//test para las distancias menores a 100km
		assertEquals(envio.calcularCosto(),1000);
		//test para las distancias mayores a 100km y menores de 500km
		envio.setDistancia(250);
		assertEquals(envio.calcularCosto(),1250);
		//test para las distacias mayores a 500km 
		envio.setDistancia(500);
		assertEquals(envio.calcularCosto(),1500);
		//distancia negativa 
		envio.setDistancia(-40);
		assertEquals(envio.calcularCosto(),1000);
	}
}
