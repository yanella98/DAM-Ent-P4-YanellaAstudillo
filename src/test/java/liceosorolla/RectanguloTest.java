package test.java.liceosorolla;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import main.java.liceosorolla.Rectangulo;

public class RectanguloTest {
	
	private Rectangulo rectangulo;
	
	@Before
	public void before() {
		rectangulo = new Rectangulo(12,6);
	}
	
	@Test
	public void comprobaRectangulo() {
		assertEquals(false, rectangulo.lados());
	}
	
	@Test
	public void comprobarPerimetro() {
		assertEquals(36, rectangulo.perimetro());
	}
	
	@Test
	public void comprobarArea() {
		assertEquals(72, rectangulo.area());
	}
	

}
