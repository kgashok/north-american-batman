package primeF;

import junit.framework.TestCase;

import java.util.*;

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
	
	/* Test 1
	 * junit.framework.AssertionFailedError: expected:<null> but was:<[]>
	 */
	
	/* Test 2 
	 * java.lang.Error: Unresolved compilation problem: 
		The method list() in the type PrimeFactorsTest is not applicable for the arguments (int)
	 */
	
	private List<Integer> list() {
		// TODO Auto-generated method stub
		return new ArrayList<Integer>();
	}

	public void testOne() throws Exception {
		assertEquals(list(), PrimeFactors.generate(1));
	}
	
	public void testTwo() throws Exception {
		assertEquals(list(2), PrimeFactors.generate(2));
	}
	

}
