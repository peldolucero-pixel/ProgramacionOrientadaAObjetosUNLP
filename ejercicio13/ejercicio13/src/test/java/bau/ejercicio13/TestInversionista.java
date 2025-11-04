package bau.ejercicio13;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
public class TestInversionista {

	Inversionista inversionista; 
	
	@BeforeEach
	void SetUp() throws Exception{
		inversionista = new Inversionista("pepe");
	}
	
	@Test
	public void testGetValorActual() {
		//inicializo inversion en accion//
		InversionEnAcciones accion = new InversionEnAcciones("google");
		accion.setCantidadDeAcciones(15);
		accion.setPrecioUnitario(100);
		
		//inicializo inversion de plazo fijo//
		InversionEnPlazoFijo plazo = new InversionEnPlazoFijo();
		plazo.setFechaDeCreacion(LocalDate.of(2025, 9, 25));
		plazo.setMontoDepositado(500);
		plazo.setPorcentajeDeInteres(1);
		
		//agrego las inversiones //
		inversionista.agregarInversion(plazo);
		inversionista.agregarInversion(accion);
		
		//testeo el valor
		assertEquals(inversionista.getValorActual(),17500);
	}
	
	@Test
	public void testSacarYAgregarInversion() {
		//inicializo inversion en accion//
		InversionEnAcciones accion = new InversionEnAcciones("google");
		accion.setCantidadDeAcciones(15);
		accion.setPrecioUnitario(100);
				
		//inicializo inversion de plazo fijo//
		InversionEnPlazoFijo plazo = new InversionEnPlazoFijo();
		plazo.setFechaDeCreacion(LocalDate.of(2025, 9, 25));
		plazo.setMontoDepositado(500);
		plazo.setPorcentajeDeInteres(1);
				
		//agrego las inversiones //
		inversionista.agregarInversion(plazo);
		inversionista.agregarInversion(accion);
		
		//elimino la inversion

		inversionista.eliminarInversion(plazo);
		assertFalse(inversionista.getInversiones().contains(plazo));
		assertTrue(inversionista.getInversiones().contains(accion));
		
	}
}
