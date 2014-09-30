package primeF;

import junit.framework.TestCase;
import java.util.*;
import static primeF.PrimeFactors.generate;

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
	/*
	 * junit.framework.AssertionFailedError: expected:<[2]> but was:<[]>
	 */	
	/*
	 * Test 3 
	 *   junit.framework.AssertionFailedError: expected:<[3]> but was:<[2]>
	 */
	
	/*
	 * Test 4
	 *   junit.framework.AssertionFailedError: expected:<[2, 2]> but was:<[4]>
	 */
	private List<Integer> list(int...ints) {
		// TODO Auto-generated method stub
		List <Integer> list = new ArrayList<Integer> ();
		for (int i : ints)
			list.add(i);
		return list;
	}

	public void testOne() throws Exception {
		assertEquals(list(), generate(1));
	}
	
	public void testTwo() throws Exception {
		assertEquals(list(2), generate(2));
	}
	
	public void testThree() throws Exception {
		assertEquals(list(3), generate(3));
	}
	
	public void testFour() throws Exception {
		assertEquals(list(2, 2), generate(4));
	}
	
	public void testSix() throws Exception {
		assertEquals(list(2, 3), generate(6));
	}
}
