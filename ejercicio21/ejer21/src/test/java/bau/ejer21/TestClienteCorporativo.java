package bau.ejer21;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class TestClienteCorporativo {
	Cliente cliente;
	Envio envio1;
	Envio envio2;
	Envio envio3;
	
	@BeforeEach
	void setUp() throws Exception{
		cliente = new ClienteCorporativo("juanAsociados", "32 N°112",2323322);
	}
	
}
