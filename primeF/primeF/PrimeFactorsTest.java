package primeF;

import junit.framework.TestCase;

import java.util.List;

public class PrimeFactorsTest extends TestCase {

	/* 
	 *  junit.framework.AssertionFailedError: No tests found in primeF.PrimeFactorsTest
	 */
	
	/*
	 * java.lang.Error: Unresolved compilation problems: 
		The method list() is undefined for the type PrimeFactorsTest
		The method generate(int) is undefined for the type PrimeFactorsTest
	*/
	
	/*
	 * java.lang.Error: Unresolved compilation problem: 
		PrimeFactors cannot be resolved

	 */

	public void testOne() throws Exception {
		assertEquals(list(), PrimeFactors.generate(1));
	}

	private List<Integer> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
