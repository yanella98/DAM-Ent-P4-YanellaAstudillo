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
}
