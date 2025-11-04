package bau.ejer21;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class TestClienteCorporativo {
	Cliente cliente;
	
	Envio envio1;
	Envio envio2;
	Envio envio3;
	@BeforeEach
	void setUp() throws Exception{
		cliente = new ClienteCorporativo("pedro", "pedro@hotmail.com", 23232323);
		Envio envio1 = new EnvioLocal(LocalDate.of(2025, 10, 15),"formosa", "la pampa", 500);
		Envio envio2 = new EnvioInterurbano(LocalDate.of(2025,11,1),"formosa", "la pampa", 50,10);
		Envio envio3 = new EnvioInternacional(LocalDate.of(2025,11,3),"formosa", "la pampa", 10);
		cliente.agregarEnvio(envio1);
		cliente.agregarEnvio(envio2);
		cliente.agregarEnvio(envio3);
	}
	
	
	@Test
	public void testCalcularCosto() {
		assertEquals(cliente.calcularMontoEnPerido(LocalDate.of(2025,10,15), LocalDate.of(2025, 11, 1)),2000);
		assertEquals(cliente.calcularMontoEnPerido(LocalDate.of(2025,10,1), LocalDate.of(2025, 10, 2)),0);
		
	}
}
