package test.java.liceosorolla;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import main.java.liceosorolla.Animal;

public class AnimalTest {
	
	private Animal animal;
	
	@Before
	public void Before() {
		animal = new Animal("Mamifero","Lince",25,5,"marron");
	}
	
	@Test
	public void comprobarEspecie() {
		assertEquals("Mamifero", animal.getEspecie());
	}
	
	@Test
	public void comprobarRaza() {
		assertEquals("Lince", animal.getRaza());
	}
	
	@Test
	public void comprobarPeso() {
		assertEquals(25, animal.getPeso());
	}
}
