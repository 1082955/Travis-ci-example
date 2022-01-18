package holo.peko;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcal {

	@Test
	public void testAdd() {
		int expectedResult=5;
		cal peko =new cal();
		assertEquals(expectedResult,peko.Add(2, 3));
	}
	@Test
	public void testSub() {
		int expectedResult=5;
		cal peko =new cal();
		assertEquals(expectedResult,peko.Sub(10, 5));
	}
	@Test
	public void testMult() {
		int expectedResult=6;
		cal peko =new cal();
		assertEquals(expectedResult,peko.Mult(2, 3));
	}
	@Test
	public void testDiv() {
		int expectedResult=5;
		cal peko =new cal();
		assertEquals(expectedResult,peko.Div(10, 2));
	}

}
