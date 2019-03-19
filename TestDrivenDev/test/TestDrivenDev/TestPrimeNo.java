package TestDrivenDev;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestPrimeNo {
	
	
	//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
	//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
	//@Ignore
	//@After
	@Test
	public void testPrimeNo() {
		assertEquals(true, PrimeNo.checkPrime(8));
	
	}
	//@Before
	@Test
	public void testEven() {
		assertEquals(true, PrimeNo.checkEven(10));
	
	}
	
	@Test
	public void test2Plus2() {
		int expected = 4;
		int result = 5;
		assertEquals(expected, result);
	}
}
