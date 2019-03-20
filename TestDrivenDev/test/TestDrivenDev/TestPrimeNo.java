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
		assertEquals(true, PrimeNo.checkPrime(2));
	
	}
	//@Before
	@Test
	public void testEven() {
		assertEquals(true, PrimeNo.checkEven(10));
	
	}
	
	@Test
	public void testIsNumber() {
		String digit = "3";
		assertEquals(true, PrimeNo.isNumber(digit));
	}

}
