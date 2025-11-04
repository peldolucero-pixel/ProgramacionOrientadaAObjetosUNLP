package bau.ejer21;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;
public class TestPersonaFisica {
	PersonaFisica personaFisica;
	Envio envio1;
	Envio envio2;
	Envio envio3;
	@BeforeEach
	void setUp() throws Exception{
		personaFisica = new PersonaFisica("pedro", "pedro@hotmail.com", 23232323);
		Envio envio1 = new EnvioLocal(LocalDate.of(2025, 10, 15),"formosa", "la pampa", 500);
		Envio envio2 = new EnvioInterurbano(LocalDate.of(2025,11,1),"formosa", "la pampa", 50,10);
		Envio envio3 = new EnvioInternacional(LocalDate.of(2025,11,3),"formosa", "la pampa", 10);
		personaFisica.agregarEnvio(envio1);
		personaFisica.agregarEnvio(envio2);
		personaFisica.agregarEnvio(envio3);
	}
	
	
	@Test
	public void testCalcularCosto() {
		assertEquals(personaFisica.calcularMontoEnPerido(LocalDate.of(2025,10,15), LocalDate.of(2025, 11, 1)),1800);
		assertEquals(personaFisica.calcularMontoEnPerido(LocalDate.of(2025,10,1), LocalDate.of(2025, 10, 2)),0);
		
	}
	
}
