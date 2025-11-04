package bau.ejer18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Set;
import java.util.HashSet;
public class TestEvenNumberSet {
	
	Set<Integer> numerosPares;
	
	@BeforeEach
	void SetUp() throws Exception{
		numerosPares = new EvenNumberSet(); 
	}
	
	@Test
	public void testAdd() {
		assertTrue(this.numerosPares.add(50));
		assertEquals(this.numerosPares.size(),1);
		assertFalse(this.numerosPares.add(3));
		assertEquals(this.numerosPares.size(),1);
	}
	
	@Test
	public void testAddAll() {
		HashSet<Integer> setNumeros = new HashSet<Integer>(); 
		setNumeros.add(2);
		setNumeros.add(13);
		this.numerosPares.addAll(setNumeros);
		setNumeros.remove(setNumeros);
		assertEquals(this.numerosPares.size(),1);
	}

}
