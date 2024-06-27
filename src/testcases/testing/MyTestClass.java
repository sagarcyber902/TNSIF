package testcases.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import testcases.businesslogic.Operations;

public class MyTestClass {

	@Test
	public void testAddition() {
		System.out.println("Addition Testing");
		
		int expected = 7;
		int actual = Operations.add(2, 5);
		
		Assertions.assertEquals(expected, actual);
		
	}
	
	@Test
	public void testFactorial() {
		System.out.println("Factorial Testing");
		
		long expected = 120;
		long actual = Operations.getFactorial(5);
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testFactorialForZero() {
		System.out.println("Factorial Testing");
		
		long expected = 1;
		long actual = Operations.getFactorial(0);
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testFactorialForNegativeNumbers() {
		System.out.println("Factorial Testing");
		
		long expected = -1;
		long actual = Operations.getFactorial(-2);
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void isPrime() {
		System.out.println("Prime Number Testing");
		Assertions.assertTrue(Operations.isPrime(3));
	}
	
	@Test
	public void testForNonPrime() {
		
		System.out.println("Non Prime testing");
		
		Assertions.assertFalse(Operations.isPrime(4));
	}
	
	@Test
	public void isPalindrome() {
		System.out.println("Palindrome Testing");
		Assertions.assertTrue(Operations.isPalindrome(121));
	}
}