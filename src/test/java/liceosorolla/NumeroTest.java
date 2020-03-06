package test.java.liceosorolla;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

import main.java.liceosorolla.Numero;

public class NumeroTest {
	
	private Numero numero;
	@Before
	public void Before() {
		numero=new Numero(5,5);
	}
	
	@Test
	public void comprobarNumero1() {
		assertEquals(5,numero.getNumero1());
	}
	
	@Test
	public void comprobarNumero2() {
		assertEquals(5,numero.getNumero2());
	}
	
	@Test
	public void comprobarSuma() {
		assertEquals(10,numero.suma());
	}
}
