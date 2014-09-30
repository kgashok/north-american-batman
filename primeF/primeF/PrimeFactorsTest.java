package primeF;

import junit.framework.TestCase;

public class PrimeFactorsTest extends TestCase {

	/* 
	 *  junit.framework.AssertionFailedError: No tests found in primeF.PrimeFactorsTest
	 */
	
	/*
	 * java.lang.Error: Unresolved compilation problems: 
		The method list() is undefined for the type PrimeFactorsTest
		The method generate(int) is undefined for the type PrimeFactorsTest
	*/

	public void testOne() throws Exception {
		assertEquals(list(),generate(1));
	}
}
